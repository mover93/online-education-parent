package com.chenming.education.system.manager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenming.education.system.entity.SysUser;
import com.chenming.education.system.mapper.SysUserMapper;
import com.chenming.education.system.service.dto.SysMenuDto;
import com.chenming.education.system.service.dto.SysRoleDto;
import com.chenming.education.system.service.dto.SysUserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台用户信息 服务实现类
 * </p>
 *
 * @author chenming
 * @since 2020-09-12
 */
@Service
public class SysUserManager extends ServiceImpl<SysUserMapper, SysUser> {

    @Resource
    private SysUserMapper sysUserMapper;

    public SysUserDto getSysUserByMobile(String mobile) {
        QueryWrapper<SysUser> qw = new QueryWrapper<>();
        qw.eq("mobile", mobile);
        SysUser sysUser = getOne(qw);
        if (sysUser != null) {
            SysUserDto sysUserDto = new SysUserDto();
            BeanUtils.copyProperties(sysUser, sysUserDto);
            return sysUserDto;
        }
        return null;
    }

    public List<SysMenuDto> listMenusByUserId(Long id) {
        return sysUserMapper.listMenusByUserId(id);
    }

    public List<SysRoleDto> listRolesByUserId(Long id) {
        return sysUserMapper.listRolesByUserId(id);
    }
}
