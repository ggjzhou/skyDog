package com.example.skydog.service.impl;

import com.example.skydog.dao.CartDao;
import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Service
public class CartServiceImpl implements CartService {
   @Autowired
   CartDao cartDao;

   /**
    * 添加购物车
    * @param cart
    */
   public void add(Cart cart) {
      cartDao.add(cart);
   }

   public void update(Cart cart) {
      cartDao.update(cart);
   }

   /**
    * 删除购物车
    * @param cartId
    */
   public void delete(Integer cartId) {
      cartDao.delete(cartId);
   }

   /**
    * id查询购物车
    * @param cartId
    * @return
    */
   public ResultVO queryId(Integer cartId) {

      return new ResultVO(ResultEnum.SUCCESS,cartDao.queryId(cartId));
   }

   public ResultVO queryCondition(Cart cart) {

      return new ResultVO(ResultEnum.SUCCESS,cartDao.queryCondition(cart));
   }

   /**
    * 查询用户的购物车
    * @param userId
    * @return
    */
   public ResultVO getMyCart(Integer userId){
      return new ResultVO(ResultEnum.SUCCESS,cartDao.getMyCart(userId));
   }
}