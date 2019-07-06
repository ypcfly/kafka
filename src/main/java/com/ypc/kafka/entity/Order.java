package com.ypc.kafka.entity;

import lombok.Data;

@Data
public class Order {
    private String userId;

    private String province;

    private String city;

    private String street;

    private String orderId;

    private String status;

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + userId + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", orderId='" + orderId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}