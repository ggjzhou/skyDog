package com.example.skydog.service.impl;

import com.example.skydog.dao.CartDao;
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

   public void add(Product product) {
      // TODO: implement
   }

   public void update(Product product) {
      // TODO: implement
   }

   public void delete(Integer productId) {
      // TODO: implement
   }

   public List<Product> queryId(Integer cartId) {
      // TODO: implement
      return null;
   }

   public List<Product> queryCondition(Product product) {
      // TODO: implement
      return null;
   }

}