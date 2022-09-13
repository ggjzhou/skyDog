package com.example.skydog.service;

import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Order;
import com.example.skydog.module.entity.User;
import com.example.skydog.module.vo.ResultVO;

import java.util.*;


public interface UserService {

   void add(User user);

   ResultVO delete(Integer userId);

   ResultVO update(User user);

   ResultVO queryId(Integer userId);

   ResultVO register(User user);

   ResultVO login(User user);

   ResultVO queryCondition(User user);


   void batchDelete(List list);

   List<User> pageQuery();

   ResultVO updatePassword(String oldPassword, String newPassword,Integer userId);

   void updateAvatar();//更新头像

   ResultVO getCart(Integer userId);

   ResultVO getOrder(Integer userId);

   ResultVO getCollect(Integer userId);

   ResultVO getEvaluate(Integer uerId);



}