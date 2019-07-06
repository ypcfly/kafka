package com.ypc.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author: ypcfly
 * @Date: 19-7-6 17:00
 * @Description:
 */
//@Component
//@Slf4j
//public class Consumer {
//
//    @KafkaListener(topics = {"USER_TOPIC","ORDER_TOPIC","PRODUCT_TOPIC"})
//    public void listen(ConsumerRecord<?,?> record) {
//        System.out.println(record);
//        log.info(">>>> @KafkaListener on method,record value message={} <<<<<",record.value().toString());
//    }
//
//}


