package com.ypc.kafka.mapper;

import com.ypc.kafka.entity.Product;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

    int insert(Product record);

    int insertSelective(Product record);

}