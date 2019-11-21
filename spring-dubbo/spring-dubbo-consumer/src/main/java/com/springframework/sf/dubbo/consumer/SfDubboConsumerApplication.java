package com.springframework.sf.dubbo.consumer;

//import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yq
 * @date: 2019/11/21 16:50
 * @description:
 */
@SpringBootApplication
//@EnableDubboConfiguration
public class SfDubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfDubboConsumerApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
