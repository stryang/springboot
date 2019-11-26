package com.springframework.sf.dysource.service;

import com.springframework.sf.dysource.annotion.DyDataSource;
import com.springframework.sf.dysource.datasource.DataSourceConstant;
import com.springframework.sf.dysource.entity.User;
import com.springframework.sf.dysource.repository.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: yq
 * @date: 2019/11/26 15:49
 * @description:
 */
@Service
@Transactional
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    public User findById(Integer id) {
        return userMapper.selectById(id);
    }

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    @DyDataSource(name = DataSourceConstant.DATA_SOURCE_BIZ)
    public User findById1(Integer id) {
        return userMapper.selectById(id);
    }

    /**
     * 新增用户
     * @param user
     */
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    /**
     * 修改用户
     * @param user
     */
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    /**
     * 删除用户
     * @param id
     */
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

}
