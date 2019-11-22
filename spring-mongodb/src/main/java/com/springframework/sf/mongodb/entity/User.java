package com.springframework.sf.mongodb.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: yq
 * @date: 2019/11/22 12:27
 * @description:
 */
@Data
@ToString
@Document(collection = "user")
public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private Integer age;
}
