package com.ypc.kafka.entity;

import lombok.Data;

@Data
public class Product {
    private String orderid;

    private String productname;

    private Integer count;

    private String price;

    private String skucode;

}