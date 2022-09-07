package com.example.skydog;

import com.example.skydog.dao.UserDao;
import com.example.skydog.module.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkydogApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserDao userDao;

    @Test

    void test(){
        User tes = new User();
        tes.setUserName("123456");
        tes.setPassword("EXPECT");
        userDao.add(tes);
    }
}
