package com.ypc.kafka.controller;

import com.ypc.kafka.entity.User;
import com.ypc.kafka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-1 21:47
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Map<String,Object> insertUser(@RequestBody User user) {

        return userService.saveUser(user);
    }
}
