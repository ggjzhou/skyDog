package com.example.skydog.service.impl;

import com.example.skydog.dao.CartDao;
import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Product;
import com.example.skydog.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

   public void delete(Integer cartId) {
      cartDao.delete(cartId);
   }

   public Cart queryId(Integer cartId) {
      return cartDao.queryId(cartId);
   }

   public List<Cart> queryCondition(Cart cart) {
      return cartDao.queryCondition(cart);
   }

}