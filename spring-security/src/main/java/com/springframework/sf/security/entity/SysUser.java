package com.springframework.sf.security.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author yq
 * @date 2019/9/5
 * @description:
 */
@Data
public class SysUser {

    private Integer id;

    private String name;

    private String password;
}
