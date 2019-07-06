package com.ypc.kafka.controller;

import com.ypc.kafka.entity.Order;
import com.ypc.kafka.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-1-6 下午6:27
 */
@Slf4j
@Component
@KafkaListener(topics = {"USER_TOPIC","ORDER_TOPIC","PRODUCT_TOPIC"})
public class MessageConsumer {

	@KafkaHandler
	public void user(User user) {
		// 处理 user ...
		log.info(">>>> kafka consumer UserType message={} <<<<",user.toString());
	}

	@KafkaHandler
	public void order(Order order) {
		// 处理 order ...
		log.info(">>>> kafka consumer OrderType message={} <<<<",order.toString());
	}


//	@KafkaHandler(isDefault = true)
//	public void object(Object object) {
//		log.info(">>>> kafka consumer UnknownType message={} <<<<",object.toString());
//
//	}


	@KafkaHandler(isDefault = true)
	public void listen(ConsumerRecord<?, ?> record) {
		log.info(">>>> kafka consumer CommonType message={} <<<<",record.toString());
	}

//	@KafkaHandler
//	public void listen(String message) {
//		log.info(">>>> kafka consumer String message={} <<<<",message);
//	}

}


