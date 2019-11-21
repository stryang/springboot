package com.springframework.sf.shiro.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author: yq
 * @date: 2019/11/21 19:56
 * @description:
 */
@Data
@ToString
public class Permissions {
    private String id;
    private String permissionsName;

    public Permissions(String id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }
}
