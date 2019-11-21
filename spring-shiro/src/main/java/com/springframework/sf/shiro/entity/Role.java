package com.springframework.sf.shiro.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @author: yq
 * @date: 2019/11/21 19:56
 * @description:
 */
@Data
@ToString
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;

    public Role(String id, String roleName, Set<Permissions> permissions) {
        this.id = id;
        this.roleName = roleName;
        this.permissions = permissions;
    }
}
