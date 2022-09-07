package com.example.skydog.dao;

import com.example.skydog.module.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Mapper
public interface CartDao {

   void add(Product product);

   void update(Product product);

   void delete(Integer productId);

   List<Product> queryId(Integer cartId);

   List<Product> queryCondition();

}