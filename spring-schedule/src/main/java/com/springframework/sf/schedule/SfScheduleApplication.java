package com.springframework.sf.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: yq
 * @date: 2019/11/21 10:28
 * @description:
 */
@SpringBootApplication
@EnableScheduling
public class SfScheduleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfScheduleApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
