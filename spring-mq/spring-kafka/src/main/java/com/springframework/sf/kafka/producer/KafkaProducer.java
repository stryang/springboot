package com.springframework.sf.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: yq
 * @date: 2019/12/11 14:42
 * @description:
 */
@Slf4j
@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public String send(String msg){
        log.info("生产者发送的消息：{}", msg);
        kafkaTemplate.send("kafkaTopicMessage", msg);
        return "success";
    }

    @PostConstruct
    private void init() {
        send("kafka消息测试kafka消息测试kafka消息测试kafka消息测试");
    }
}
