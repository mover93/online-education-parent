package com.chenming.education.system.service;

import com.chenming.education.system.service.dto.SysUserDto;

/**
 * description: SysUserService <br>
 * author: chenming <br>
 * date: 2020/10/28 21:29 <br>
 * version: 1.0 <br>
 */
public interface SysUserService {

    SysUserDto getSysUserByMobile(String mobile);
}
