package com.ypc.kafka.service.impl;

import com.ypc.kafka.entity.User;
import com.ypc.kafka.mapper.UserMapper;
import com.ypc.kafka.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-1 21:50
 * @Description:
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static String TOPIC = "USER_TOPIC";

    @Override
    public Map<String, Object> saveUser(User user) {
        Map<String,Object> resultMap = new HashMap<>();

        int insert = userMapper.insert(user);
        if (insert == 1) {
            kafkaTemplate.send(TOPIC,"user",user);
        }
        return resultMap;
    }
}
