package com.example.skydog.service;

import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.PageBeans;
import com.example.skydog.module.vo.Pages;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Service
public interface ProductService {

   void add(Product product);

   void update(Product product);

   void delete(Integer productId);

   Product queryId(Integer productId);

   List<Product> queryCondition(Product product);

   Pages<Product> queryByPage(PageBeans pageBeans);

   List<Product> queryByCategory(Integer categoryId);

   List<Product> queryByPrice(Double productPrice);

   List<Product> queryByName(String productName);

}