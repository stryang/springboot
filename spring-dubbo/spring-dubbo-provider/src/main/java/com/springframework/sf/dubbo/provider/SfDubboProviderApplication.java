package com.springframework.sf.dubbo.provider;

//import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yq
 * @date: 2019/11/21 16:27
 * @description:
 */
@SpringBootApplication
//@EnableDubboConfiguration
public class SfDubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfDubboProviderApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
