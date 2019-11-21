package com.springframework.sf.oauth.controller;

import com.springframework.sf.oauth.constant.AuthConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author yq
 * @date 2019/9/26
 * @description:
 */
@RestController
@RequestMapping("/sso")
@CrossOrigin
public class SsoController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/checkToken")
    public String checkToken(HttpServletRequest request) {

        HttpSession session = request.getSession();

        request.getServerName(); //获取域名
        request.getServerPort(); //获取端口号

        request.getLocalName();
        request.getLocalPort();

        request.getRemoteHost();
        request.getRemotePort();

        System.out.println("getServerName: " + request.getServerName());
        System.out.println("getServerPort: " + request.getServerPort());

        System.out.println("getLocalName: " + request.getLocalName());
        System.out.println("getLocalPort: " + request.getLocalPort());

        System.out.println("getRemoteHost: " + request.getRemoteHost());
        System.out.println("getRemoteUser: " + request.getRemoteUser());
        System.out.println("getRemotePort: " + request.getRemotePort());

        System.out.println("sessionId: " + session.getId());

        Object obj = session.getAttribute("account");

//        System.out.println("account: " + obj.toString());

//        String token = (String) redisTemplate.opsForValue().get(session.getId());

        return session.getId();
    }
}
