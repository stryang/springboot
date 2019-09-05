package com.springframework.sf.security.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yq
 * @date 2019/9/5
 * @description:
 */
@Data
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;
}
