package com.springframework.sf.mongodb.controller;

import com.springframework.sf.mongodb.entity.User;
import com.springframework.sf.mongodb.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: yq
 * @date: 2019/11/22 12:28
 * @description:
 */
@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Autowired
    private MongoService mongoService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return mongoService.findById(id);
    }

    @PostMapping
    public boolean save(@RequestBody User user) {
        return mongoService.save(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") String id) {
        return mongoService.deleteById(id);
    }

    @PutMapping
    public boolean update(@RequestBody User user) {
        return mongoService.update(user);
    }
}
