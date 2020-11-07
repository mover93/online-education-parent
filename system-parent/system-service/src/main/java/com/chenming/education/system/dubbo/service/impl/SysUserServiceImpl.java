package com.chenming.education.system.dubbo.service.impl;

import com.chenming.education.system.manager.SysUserManager;
import com.chenming.education.system.service.SysUserService;
import com.chenming.education.system.service.dto.SysMenuDto;
import com.chenming.education.system.service.dto.SysRoleDto;
import com.chenming.education.system.service.dto.SysUserDto;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * description: SysUserServiceImpl <br>
 * author: chenming <br>
 * date: 2020/10/28 21:36 <br>
 * version: 1.0 <br>
 */
@DubboService
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserManager sysUserManager;

    @Override
    public SysUserDto getSysUserByMobile(String mobile) {
        return sysUserManager.getSysUserByMobile(mobile);
    }

    @Override
    public List<SysMenuDto> listMenusByUserId(Long id) {
        return sysUserManager.listMenusByUserId(id);
    }

    @Override
    public List<SysRoleDto> listRolesByUserId(Long id) {
        return sysUserManager.listRolesByUserId(id);
    }
}
