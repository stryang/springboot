package com.springframework.sf.hibernate.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author: yq
 * @date: 2019/11/21 11:01
 * @description:
 */
@Data
@ToString
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String username;

    private String password;

    private int age;
}
