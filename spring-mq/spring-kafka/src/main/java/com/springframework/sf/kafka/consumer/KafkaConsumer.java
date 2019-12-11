package com.springframework.sf.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author: yq
 * @date: 2019/12/11 14:44
 * @description:
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "kafkaTopicMessage")
    public void listen (ConsumerRecord<?, ?> record) throws Exception {
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }
}
