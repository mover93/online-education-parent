package com.chenming.education.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenming.education.system.entity.SysUser;
import com.chenming.education.system.service.dto.SysMenuDto;
import com.chenming.education.system.service.dto.SysRoleDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户信息 Mapper 接口
 * </p>
 *
 * @author chenming
 * @since 2020-09-12
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysMenuDto> listMenusByUserId(@Param(value = "id") Long id);

    List<SysRoleDto> listRolesByUserId(@Param(value = "id") Long id);
}
