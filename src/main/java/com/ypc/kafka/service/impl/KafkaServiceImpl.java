package com.ypc.kafka.service.impl;

import com.ypc.kafka.service.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: ypcfly
 * @Date: 19-7-1 22:30
 * @Description:
 */
@Slf4j
@Service
public class KafkaServiceImpl implements KafkaService {


    @Override
    public void getMessage( ) {
        log.info(">>>>  <<<<");
    }
}
