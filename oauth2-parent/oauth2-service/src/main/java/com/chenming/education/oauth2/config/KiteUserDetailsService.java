package com.chenming.education.oauth2.config;

import com.chenming.education.system.service.SysUserService;
import com.chenming.education.system.service.dto.SysRoleDto;
import com.chenming.education.system.service.dto.SysUserDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.utils.StringUtils;
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

        if (StringUtils.isEmpty(username)) {
            throw new RuntimeException("username can not empty");
        }

        // 1、根据username获取用户
        SysUserDto sysUserDto = sysUserService.getSysUserByMobile(username);
        if (sysUserDto == null) {
            throw new UsernameNotFoundException("the user is not found");
        }

        // 2、获取用户的权限
        List<SysRoleDto> roles = sysUserService.listRolesByUserId(sysUserDto.getId());
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (SysRoleDto role: roles) {
            authorities.add(new SimpleGrantedAuthority(role.getId().toString()));
        }
        // 3、加密密码
        String password = passwordEncoder.encode(sysUserDto.getPassword());
        return new User(username,password, authorities);
    }
}
