package com.springframework.sf.config.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: yq
 * @date: 2019/11/22 09:35
 * @description:
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String username;
    private String password;
    private Integer age;
}
