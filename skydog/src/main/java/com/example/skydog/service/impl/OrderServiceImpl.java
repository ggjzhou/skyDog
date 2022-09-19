package com.example.skydog.service.impl; /***********************************************************************
 * Module:  OrderServiceImpl.java
 * Author:  86159
 * Purpose: Defines the Class OrderServiceImpl
 ***********************************************************************/

import com.example.skydog.dao.OrderDao;
import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Order;
import com.example.skydog.module.vo.OrderVo;
import com.example.skydog.module.vo.PageBeans;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Author:付贵平，甘舟
 * Data:2022/9/7
 */
@Service
public class OrderServiceImpl implements OrderService {

   @Autowired
   OrderDao orderdao;
   public ResultVO add(Order order) throws ParseException {
      // TODO: implement
      orderdao.add(order);
      System.out.println(order.toString());
      SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd HH:mm:ss
      String date_string = formatter.format(order.getCreateTime());
      SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
      order.setCreateTime(format.parse(date_string));
      System.out.println(order.toString());
      List<Order> orderList = orderdao.queryCondition(new Order());
      return new ResultVO(ResultEnum.SUCCESS,orderList.get(orderList.size()-1));
   }


   public void delete(int orderId) {
      // TODO: implement
      orderdao.delete(orderId);
   }


   public List<Order> queryId(int userId) {
      // TODO: implement
      return orderdao.queryId(userId);
   }

   public List<Order> queryCondition(Order order) {
      // TODO: implement
     return orderdao.queryCondition(order);
   }


   public void update(Order order) {
      // TODO: implement
      orderdao.update(order);
   }


  /* public void batchAdd(List<Order> orderList) {
      // TODO: implement
   }*/


   public void batchDelete(List list) {
      // TODO: implement
      orderdao.batchDelete(list);
   }

   public List<Order> pageQuery() {
      // TODO: implement
      return null;
   }


   public List<Order> queryByBuildTime(OrderVo orderVo) {

      return orderdao.queryCondition(orderVo);
   }


   public List<Order> queryByproductId(Integer productId) {
      // TODO: implement
      Order order=new Order();
      order.setProductId(productId);
      return orderdao.queryCondition(order);
   }


   public List<Order> queryByStatus(Order order) {
     return orderdao.getMyOrder(order);
   }

   public List<Order> getMyOrder(Order order){
      return orderdao.getMyOrder(order);
   }

   /**
    * 分页查询
    * @param orderVo
    * @return
    */
   public  ResultVO getOrder(OrderVo orderVo){
      PageBeans pageBeans = new PageBeans();
      pageBeans.setCurrentPage(orderVo.getCurrentPage());
      pageBeans.setPageSize(orderVo.getPageSize());
      pageBeans.setCount(orderdao.countBySelectActive(orderVo));
      pageBeans.setData(orderdao.queryBySelectActive(orderVo));
      return new ResultVO(ResultEnum.SUCCESS,pageBeans);
   }
}