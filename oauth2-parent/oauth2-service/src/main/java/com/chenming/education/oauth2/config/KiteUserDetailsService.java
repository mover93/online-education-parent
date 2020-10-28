package com.chenming.education.oauth2.config;

import com.chenming.education.system.service.SysUserService;
import com.chenming.education.system.service.dto.SysUserDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * description: KiteUserDetailsService <br>
 * author: chenming <br>
 * date: 2020/10/27 19:52 <br>
 * version: 1.0 <br>
 */
@Slf4j
@Component(value = "kiteUserDetailsService")
public class KiteUserDetailsService implements UserDetailsService {

    @DubboReference
    private SysUserService sysUserService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("usernameis:" + username);
        SysUserDto sysUserDto = sysUserService.getSysUserByMobile(username);
        log.info("sysUserDto={}", sysUserDto);

        // 查询数据库操作
        if(!username.equals("admin")){
            throw new UsernameNotFoundException("the user is not found");
        }else{
            // 用户角色也应在数据库中获取
            String role = "ROLE_ADMIN";
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(role));
            // 线上环境应该通过用户名查询数据库获取加密后的密码
            String password = passwordEncoder.encode("123456");
            return new User(username,password, authorities);
        }
    }
}
