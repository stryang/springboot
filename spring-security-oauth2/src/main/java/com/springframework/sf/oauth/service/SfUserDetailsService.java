package com.springframework.sf.oauth.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yq
 * @date 2019/9/9
 * @description:
 */
@Component
public class SfUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名从数据库或者redis中获取密码和权限，这里简化了这个过程，只验证用户名
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        if("yang".equals(username)) {
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
        } else if("admin".equals(username)) {
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return new User(username, "123456", grantedAuthorityList);
    }
}
