package com.example.skydog.service.impl;

import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.PageBeans;
import com.example.skydog.module.vo.Pages;
import com.example.skydog.service.ProductService;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
public class ProductServiceImpl implements ProductService {

   

   public void add(Product product) {
      // TODO: implement
   }
   

   public void update(Product product) {
      // TODO: implement
   }
   

   public void delete(Integer productId) {
      // TODO: implement
   }
   

   public List<Product> queryId(Integer productId) {
      // TODO: implement
      return null;
   }

   public List<Product> queryCondition(Product product) {
      // TODO: implement
      return null;
   }
   

   public Pages<Product> queryByPage(PageBeans pageBeans){
      return null;
   }
   

   public List<Product> queryByCategory(Integer categoryId) {
      // TODO: implement
      return null;
   }

   public List<Product> queryByPrice(Double productPrice) {
      // TODO: implement
      return null;
   }

   public List<Product> queryByName(String productName) {
      // TODO: implement
      return null;
   }

}