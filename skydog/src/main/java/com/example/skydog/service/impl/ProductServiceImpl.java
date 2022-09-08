package com.example.skydog.service.impl;

import com.example.skydog.dao.ProductDao;
import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.PageBeans;
import com.example.skydog.module.vo.Pages;
import com.example.skydog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
public class ProductServiceImpl implements ProductService {

   @Autowired
   ProductDao productDao;

   /**
    * 添加商品
    * @param product
    */
   public void add(Product product) {
      productDao.add(product);
   }

   /**
    * 修改商品
    * @param product
    */
   public void update(Product product) {
      productDao.update(product);
   }

   /**
    * 删除商品
    * @param productId
    */
   public void delete(Integer productId) {
      productDao.delete(productId);
   }

   /**
    * 通过id查询单个商品
    * @param productId
    * @return
    */
   public Product queryId(Integer productId) {
      return productDao.queryId(productId);
   }

   /**
    * 动态模糊查询商品
    * @param product
    * @return
    */
   public List<Product> queryCondition(Product product) {
      List<Product> products = productDao.queryCondition(product);
      if(products.isEmpty()){
         return null;
      }else {
         return productDao.queryCondition(product);
      }

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
      Product product = new Product();
      product.setProductName(productName);
      return productDao.queryCondition(product);
   }

}