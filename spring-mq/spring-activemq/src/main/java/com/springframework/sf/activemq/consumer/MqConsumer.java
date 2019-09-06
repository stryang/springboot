package com.springframework.sf.activemq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yq
 * @date 2019/8/23
 * @description:
 */
@Component
@Slf4j
public class MqConsumer {

    @JmsListener(destination = "MQMessage", containerFactory = "jmsListenerContainerTopic")
    public void receive(String receive) {
        //给在线用户发送通知
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        executor.execute(new Runnable() {
            public void run() {
                System.out.println("run: 收到一条信息: " + receive);
            }
        });
        executor.shutdown();
    }
}
