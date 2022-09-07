package com.example.skydog.service;

import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Order;
import com.example.skydog.module.entity.User;

import java.util.*;


public interface UserService {

   void add(User user);

   void delete(Integer userId);

   void update(User user);

   User queryId(Integer userId);

   User register(User user);

   User login(User user);

   void batchAdd(List<User> userList);

   void batchDelete(List list);

   List<User> pageQuery();

   void updatePassword(String oldPassword, String newPassword);

   void updateAvatar();

   List<Cart> getCart();

   List<Order> getOrder();

}