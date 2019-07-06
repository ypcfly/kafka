package com.ypc.kafka.controller;

import com.ypc.kafka.entity.Order;
import com.ypc.kafka.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-3 21:28
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public Map<String,Object> saveOrder(@RequestBody Order order) {

        return orderService.saveOrder(order);
    }

}
