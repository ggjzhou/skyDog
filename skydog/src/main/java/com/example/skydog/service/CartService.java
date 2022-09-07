package com.example.skydog.service;

import com.example.skydog.module.entity.Product;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Service
public interface CartService {

   void add(Product product);

   void update(Product product);

   void delete(Integer productId);

   List<Product> queryId(Integer cartId);

   List<Product> queryCondition(Product product);

}