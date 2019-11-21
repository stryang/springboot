package com.springframework.sf.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yq
 * @date: 2019/11/21 12:53
 * @description:
 */
@SpringBootApplication
@MapperScan("com.springframework.sf.mybatisplus.mapper")
public class SfMybatisplusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfMybatisplusApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
