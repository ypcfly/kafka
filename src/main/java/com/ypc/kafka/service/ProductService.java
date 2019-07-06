package com.ypc.kafka.service;

import com.ypc.kafka.entity.Product;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-5 22:20
 * @Description:
 */
public interface ProductService {

    Map<String, Object> save(Product product);
}
