package com.example.skydog.dao;

import com.example.skydog.module.entity.User;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface UserDao {

    void add(User user);

    void delete(Integer userId);

    User queryId(Integer userId);

    void update(User user);

    List<User> queryCondition(User user);

    void batchAdd(List<User> userList);

    void batchDelete(List list);

    List<User> pageQuery();


}