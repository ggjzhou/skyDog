package com.example.skydog.service;

import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Order;
import com.example.skydog.module.entity.User;

import java.util.*;


public interface UserService {

   void add(User user);

   void delete(int userId);

   void update(User user);

   List<User> queryId(int userId);

   void batchAdd(List<User> userList);

   void batchDelete(List list);

   List<User> pageQuery();

   void register(String userName, String password);

   void login(String userName, String password);

   void updatePassword(String oldPassword, String newPassword);

   void updateAvatar();

   List<Cart> getCart();

   List<Order> getOrder();

}