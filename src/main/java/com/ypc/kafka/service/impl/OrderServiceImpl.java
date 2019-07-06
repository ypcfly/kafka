package com.ypc.kafka.service.impl;

import com.ypc.kafka.entity.Order;
import com.ypc.kafka.mapper.OrderMapper;
import com.ypc.kafka.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-3 21:30
 * @Description:
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static String TOPIC = "ORDER_TOPIC";

    @Override
    public Map<String, Object> saveOrder(Order order) {
        Map<String,Object> resultMap = new HashMap<>();

        int insert = orderMapper.insert(order);

        if (insert == 1) {
            kafkaTemplate.send(TOPIC,"order",order);
        }

        return resultMap;
    }
}
