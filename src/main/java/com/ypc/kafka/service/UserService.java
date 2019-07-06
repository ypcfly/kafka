package com.ypc.kafka.service;

import com.ypc.kafka.entity.User;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-1 21:49
 * @Description:
 */
public interface UserService {

    Map<String, Object> saveUser(User user);
}
