package com.example.skydog.service.impl;

import com.example.skydog.dao.UserDao;
import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Order;
import com.example.skydog.module.entity.User;
import com.example.skydog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }


    public void delete(Integer userId) {
        userDao.delete(userId);
    }


    public void update(User user) {
        userDao.update(user);
    }


    public User queryId(Integer userId) {
        return userDao.queryId(userId);
    }


    public User register(User user) {
        User u = new User();
        String nick = "User" + new Date().toString();
        u.setNick(nick);
        u.setUserName(user.getUserName());
        u.setPassword(user.getPassword());
        List<User> list = userDao.queryCondition(u);
        if (list.isEmpty()) {
            userDao.add(u);
            return u;
        } else {
            return null;
        }
    }


    public User login(User user) {
        User u = new User();
        u.setUserName(user.getUserName());
        List<User> list = userDao.queryCondition(u);
        if (list == null || list.isEmpty()) {
            return null;
        } else if(list.get(0).getPassword().equals(u.getPassword())) {
            return u;
        }else
            return null;
    }

    public void batchAdd(List<User> userList) {
        // TODO: implement
    }


    public void batchDelete(List list) {
        // TODO: implement
    }


    public List<User> pageQuery() {
        // TODO: implement
        return null;
    }


    public void updatePassword(String oldPassword, String newPassword) {
        // TODO: implement
    }


    public void updateAvatar() {
        // TODO: implement
    }


    public List<Cart> getCart() {
        // TODO: implement
        return null;
    }


    public List<Order> getOrder() {
        // TODO: implement
        return null;
    }

}