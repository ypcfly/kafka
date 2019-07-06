package com.ypc.kafka.controller;

import com.ypc.kafka.entity.Product;
import com.ypc.kafka.service.ProductService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-1-6 下午6:23
 */
@Controller
@RequestMapping("/pro")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public Map<String,Object> save(@RequestBody Product product) {

		return productService.save(product);
	}

}
