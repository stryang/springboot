package com.springframework.sf.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yq
 * @date: 2019/11/21 11:45
 * @description:
 */
@SpringBootApplication
@EnableAdminServer
public class SfAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfAdminServerApplication.class, args);
        System.out.println("########################finsh.##################");
    }
}
