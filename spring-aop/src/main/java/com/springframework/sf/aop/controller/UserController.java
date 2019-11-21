package com.springframework.sf.aop.controller;

import com.springframework.sf.aop.annotation.UserAnnotaion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yq
 * @date: 2019/11/21 10:00
 * @description:
 */
@RestController
public class UserController {

    @RequestMapping("/first")
    public Object first() {
        return "first controller";
    }

    @RequestMapping("/doError")
    public Object error() {
        return 1 / 0;
    }

    @RequestMapping("/second")
    @UserAnnotaion(desc = "second")
    public Object second() {
        return "second controller";
    }

}
