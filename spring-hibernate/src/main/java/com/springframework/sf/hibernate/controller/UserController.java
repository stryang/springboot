package com.springframework.sf.hibernate.controller;

import com.springframework.sf.hibernate.entity.User;
import com.springframework.sf.hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yq
 * @date: 2019/11/21 11:11
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userRepository.findUserById(Integer.parseInt(id));
    }

    @GetMapping("/getUserByUsername/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {
        return userRepository.findUserByName(username);
    }
}
