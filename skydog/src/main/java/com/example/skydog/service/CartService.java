package com.example.skydog.service;

import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.ResultVO;
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

   ResultVO queryId(Integer cartId);

   ResultVO queryCondition(Cart cart);

   ResultVO getMyCart(Integer userId);
}