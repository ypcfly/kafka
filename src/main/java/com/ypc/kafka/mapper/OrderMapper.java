package com.ypc.kafka.mapper;

import com.ypc.kafka.entity.Order;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    int insert(Order record);

    int insertSelective(Order record);

}