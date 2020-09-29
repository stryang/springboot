package com.springframework.sf.validated.controller;

import com.springframework.sf.validated.entity.User;
import com.springframework.sf.validated.util.Result;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/save")
    public Result save(@RequestBody @Validated User user) {
        return Result.success(user.toString());
    }
}
