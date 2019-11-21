package com.springframework.sf.swagger.controller;

import com.springframework.sf.swagger.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: yq
 * @date: 2019/11/21 09:09
 * @description:restful接口
 */
@Api("用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    private final static List<User> userList = new ArrayList<>();{
        userList.add(new User(1, "admin", "123456", 33));
        userList.add(new User(2, "jacks", "123456", 22));
    }


    @ApiOperation(value = "根据id获取用户",notes = "id必须是数字")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "用户id",required = true,paramType = "path")})
    @ApiResponses({@ApiResponse(code=400,message="id为空")})
    @GetMapping("/{id}")
    public User get(@PathVariable("id") int id){
        Optional<User> op = userList.stream().filter( (u) -> u.getId() == id).findFirst();
        return op.orElse(null);
    }

    @ApiOperation("获取列表")
    @GetMapping("list")
    public List userList() {
        return userList;
    }

    @ApiOperation("新增用户")
    @PostMapping("save")
    public boolean save(User user) {
        return userList.add(user);
    }

    @ApiOperation("更新用户")
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    @PutMapping("update")
    public boolean update(User user) {
        return userList.remove(user) && userList.add(user);
    }

    @ApiOperation("批量删除")
    @DeleteMapping("delete")
    public boolean delete(@RequestBody List<User> users) {
        return userList.removeAll(users);
    }
}
