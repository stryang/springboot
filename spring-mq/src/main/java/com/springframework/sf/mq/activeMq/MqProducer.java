package com.springframework.sf.mq.activeMq;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @author yq
 * @date 2019/8/23
 * @description:
 */
@Service
@Slf4j
public class MqProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMQQueueMsg(String destinationName, String message){
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
        log.info("sendMQQueueMsg：" + message);
    }

    public void sendMQTopicMsg(String destinationName, String message){
        Destination destination = new ActiveMQTopic(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
        log.info("sendMQTopicMsg：" + message);
    }
}
