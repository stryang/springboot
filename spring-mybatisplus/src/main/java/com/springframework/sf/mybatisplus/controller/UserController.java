package com.springframework.sf.mybatisplus.controller;
import java.util.Map;
import java.util.Date;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springframework.sf.mybatisplus.utils.R;
import com.springframework.sf.mybatisplus.entity.User;
import com.springframework.sf.mybatisplus.service.IUserService;

/**
 *
 * @author: yq
 * @date: 2019-11-21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return R
    */
    @GetMapping("/{id}")
    public R get(@PathVariable("id") String id){
        return R.ok(iUserService.getById(id));
    }


    /**
    * 分页查询信息
    *
    * @param page 分页对象
    * @param user 实体
    * @return 分页对象
    */
    @RequestMapping("/page")
    public R page(Page page, User user){
        return R.ok(iUserService.page(page, Wrappers.query(user)));
    }

    /**
    * 添加
    * @param  user 实体
    * @return
    */
    @PostMapping
    public R save(@RequestBody User user){
        return R.ok(iUserService.save(user));
    }

    /**
    * 删除
    * @param id ID
    * @return R
    */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable String id){
        return R.ok(iUserService.removeById(id));
    }

    /**
    * 修改
    * @param  user 实体
    * @return success/false
    */
    @PutMapping
    public R<Boolean> edit(@RequestBody User user){
        return R.ok(iUserService.updateById(user));
    }
}