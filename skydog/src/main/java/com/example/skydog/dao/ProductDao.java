package com.example.skydog.dao;

import com.example.skydog.module.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;
/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Mapper
public interface ProductDao {

   void add(Product product);

   void batchAdd(List<Product> products);

   void update(Product product);

   void delete(Integer productId);

   void batchDelete(List list);

   Product queryId(Integer productId);

   List<Product> queryCondition(Product product);

}