package com.springframework.sf.redis.controller;

import com.springframework.sf.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yq
 * @date 2019/9/6
 * @description:
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/setString")
    public String setString (String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return (String) this.redisUtil.getValue(key);
    }
}
