package com.springframework.sf.mybatisplus.service.impl;

import com.springframework.sf.mybatisplus.entity.User;
import com.springframework.sf.mybatisplus.mapper.UserMapper;
import com.springframework.sf.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yq
 * @since 2019-11-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
