package com.example.skydog.service;

import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Product;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Service
public interface CartService {

   void add(Cart cart);

   void update(Cart cart);

   void delete(Integer cartId);

   List<Product> queryId(Integer cartId);

   List<Product> queryCondition(Cart cart);

}