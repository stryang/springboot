package com.springframework.sf.swagger.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author: yq
 * @date: 2019/11/21 09:07
 * @description:
 */
@Data
@ApiModel(description="用户实体类")
public class User {
    private int id;
    private String username;
    private String password;
    private int age;

    public User(int id, String username, String password, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }
}
