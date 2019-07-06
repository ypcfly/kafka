package com.ypc.kafka.service;

import com.ypc.kafka.entity.Order;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-3 21:29
 * @Description:
 */
public interface OrderService {

    Map<String, Object> saveOrder(Order order);
}
