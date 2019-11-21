package com.springframework.sf.shiro.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @author: yq
 * @date: 2019/11/21 19:35
 * @description:
 */
@Data
@ToString
public class User {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;

    public User(String id, String userName, String password, Set<Role> roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }
}
