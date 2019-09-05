package com.springframework.sf.security.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yq
 * @date 2019/9/5
 * @description:
 */
@Data
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;
}
