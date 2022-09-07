package com.example.skydog.dao;

import com.example.skydog.module.entity.User;

import java.util.*;


public interface UserDao {

   void add(User user);

   void delete(int userId);

   List<User> queryId(int userId);

   void batchAdd(List<User> userList);

   void batchDelete(List list);

   List<User> pageQuery();

   void update(User user);

}