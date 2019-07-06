package com.ypc.kafka.entity;

import lombok.Data;


@Data
public class User {
    private Integer id;

    private Integer age;

    private String username;

    private String sex;

    private String userid;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}