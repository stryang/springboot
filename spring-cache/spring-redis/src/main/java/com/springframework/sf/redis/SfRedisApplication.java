package com.springframework.sf.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yq
 * @date 2019/9/6
 * @description:
 */
@SpringBootApplication
public class SfRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfRedisApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
