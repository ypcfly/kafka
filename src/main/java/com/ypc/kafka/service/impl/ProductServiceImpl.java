package com.ypc.kafka.service.impl;

import com.ypc.kafka.entity.Product;
import com.ypc.kafka.mapper.ProductMapper;
import com.ypc.kafka.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-7-5 22:21
 * @Description:
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static final String TOPIC = "PRODUCT_TOPIC";

    @Override
    public Map<String, Object> save(Product product) {
        Map<String,Object> resultMap = new HashMap<>();

        int insert = productMapper.insert(product);
        if (insert == 1) {
//            Message<Product> message = MessageBuilder.withPayload(product)
//                                        .setHeader("type",Product.class.getName())
//                                        .setHeader(KafkaHeaders.TOPIC,TOPIC).build();
            kafkaTemplate.send(TOPIC,product);
            resultMap.put("success",true);
            resultMap.put("message","save success and send to MQ succeed");
        } else {
            // 保存失败
            resultMap.put("message","save failed");
        }

        return resultMap;
    }
}
