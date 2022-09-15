package com.example.skydog.service; /***********************************************************************
 * Module:  Interface_OrderServiceImpl.java
 * Author:  86159
 * Purpose: Defines the Interface Interface_OrderServiceImpl
 ***********************************************************************/

import com.example.skydog.module.entity.Order;
import com.example.skydog.module.vo.OrderVo;

import java.util.*;


public interface OrderService {

   void add(Order order);

   void delete(int orderId);

   List<Order> queryId(int userId);

   List<Order> queryCondition(Order order);

   void update(Order order);

   //void batchAdd(List<Order> orderList);

   void batchDelete(List list);

   List<Order> pageQuery();

   List<Order> queryByBuildTime(OrderVo orderVo);

   List<Order> queryByproductId(Integer productId);

   List<Order> queryByStatus(Order order);

   List<Order> getMyOrder(Order order);
}