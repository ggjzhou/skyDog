package com.example.skydog.service.impl;

import com.example.skydog.dao.CartDao;
import com.example.skydog.dao.UserDao;
import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Order;
import com.example.skydog.module.entity.User;
import com.example.skydog.module.vo.ResultVO;
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

    @Autowired

    private CartDao cartDao;

    public void add(User user) {
        userDao.add(user);
    }



    /**
     * */
    public ResultVO delete(Integer userId) {
        User u = new User();
        u.setUserId(userId);
        if (userDao.queryCondition(u).isEmpty()) {
            return new ResultVO(ResultEnum.DELETE_FAIL, "用户不存在");
        } else {
            userDao.delete(userId);
            return new ResultVO(ResultEnum.DELETE_SUCCESS);
        }
    }


    public ResultVO update(User user) {
        User u = new User();
        u.setUserId(user.getUserId());
        if (userDao.queryCondition(u).isEmpty()) {
            return new ResultVO(ResultEnum.UPDATE_FAIL, "用户不存在");
        } else {
            userDao.update(user);
            return new ResultVO(ResultEnum.UPDATE_SUCCESS);
        }
    }


    public ResultVO queryId(Integer userId) {
        return new ResultVO(userDao.queryId(userId));
    }


    public ResultVO register(User user) {
        User u = new User();
        String nick = "User" + new Date().toString();
        u.setNick(nick);
        u.setUserName(user.getUserName());
        u.setPassword(user.getPassword());
        List<User> list = userDao.queryCondition(u);
        if (list.isEmpty()) {
            userDao.add(u);
            return new ResultVO(ResultEnum.SUCCESS, "注册成功");
        } else {
            return new ResultVO(ResultEnum.FAIL, "该账号已存在");
        }
    }


    public ResultVO login(User user) {
        User u = new User();
        u.setUserName(user.getUserName());
        List<User> list = userDao.queryCondition(u);
        if (list == null || list.isEmpty()) {
            return new ResultVO(ResultEnum.FAIL, "该账号不存在");
        } else if (list.get(0).getPassword().equals(u.getPassword())) {
            return new ResultVO(list.get(0));
        } else
            return new ResultVO(ResultEnum.FAIL, "密码错误");
    }

    @Override
    public ResultVO queryCondition(User user) {
        return new ResultVO(userDao.queryCondition(user));
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


    public ResultVO updatePassword(String oldPassword, String newPassword, Integer userId) {
        User u = userDao.queryId(userId);
        if (u == null) {
            return new ResultVO(ResultEnum.UPDATE_FAIL, "该用户不存在");
        } else if (u.getPassword().equals(oldPassword)) {
            u.setPassword(newPassword);
            userDao.update(u);
            return new ResultVO(ResultEnum.UPDATE_SUCCESS);
        } else {
            return new ResultVO(ResultEnum.UPDATE_FAIL, "密码错误");
        }
    }


    public void updateAvatar() {
        // TODO: implement
    }


    public List<Cart> getCart() {
        /**调用*/
        return null;
    }


    public List<Order> getOrder() {
        /**调用*/
        return null;
    }

}