package com.springframework.sf.security.service;

import com.springframework.sf.security.entity.SysRole;
import com.springframework.sf.security.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yq
 * @date 2019/9/5
 * @description:
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}
