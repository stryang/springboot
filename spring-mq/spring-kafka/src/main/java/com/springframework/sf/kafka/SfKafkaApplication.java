package com.springframework.sf.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yq
 * @date: 2019/12/11 14:41
 * @description:
 */
@SpringBootApplication
public class SfKafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfKafkaApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
