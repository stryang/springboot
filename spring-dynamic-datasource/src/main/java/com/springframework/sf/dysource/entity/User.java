package com.springframework.sf.dysource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: yq
 * @date: 2019/11/26 15:48
 * @description:
 */
@Data
@TableName(value = "user")
public class User {

    @TableId(value="id", type= IdType.ID_WORKER_STR)
    private String id;

    private String username;
    private String password;
    private Integer age;
}
