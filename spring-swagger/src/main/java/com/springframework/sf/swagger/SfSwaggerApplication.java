package com.springframework.sf.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: yq
 * @date: 2019/11/21 09:03
 * @description:
 */
@SpringBootApplication
@EnableSwagger2
public class SfSwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfSwaggerApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
