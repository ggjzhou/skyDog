package com.example.skydog.controller;

import com.example.skydog.module.entity.User;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:用户前端控制器
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public User login(@RequestBody User user) {
//        ResultVO resultVO = new ResultVO();
//        resultVO.ResultVOa();
        return userService.login(user);
    }


    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }


}
