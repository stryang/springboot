package com.springframework.sf.oauth.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yq
 * @date 2019/9/9
 * @description:
 */
@RestController
@RequestMapping("/api")
public class OauthController {
    @RequestMapping("/client/{id}")
    public String getBlogById(@PathVariable long id) {
        return "client id: " + id;
    }
}
