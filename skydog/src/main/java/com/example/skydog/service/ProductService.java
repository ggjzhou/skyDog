package com.example.skydog.service;

import com.example.skydog.module.entity.Category;
import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.PageBeans;
import com.example.skydog.module.vo.Pages;
import com.example.skydog.module.vo.ResultVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Service
public interface ProductService {

   ResultVO add(Product product);

   ResultVO update(Product product);

   ResultVO delete(Integer productId);

   ResultVO queryId(Integer productId);

   ResultVO queryCondition(Product product);

   Pages<Product> queryByPage(PageBeans pageBeans);

   List<Product> queryByCategory(Category category);

   List<Product> queryByPrice(Double productPrice);

   List<Product> queryByName(String productName);

}