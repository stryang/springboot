package com.springframework.sf.config.config;

import com.springframework.sf.config.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: yq
 * @date: 2019/11/22 09:41
 * @description:
 */
@Component
public class ConfigUser {

    @Autowired
    private User user;
    @Value("${user.username}")
    private String username;

    @PostConstruct
    public void init() {
        System.out.println("user对象注入：" + user.toString());
        System.out.println("value注解注入属性username：" + username);
    }
}
