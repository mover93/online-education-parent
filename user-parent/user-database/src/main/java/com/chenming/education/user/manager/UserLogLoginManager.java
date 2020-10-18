package com.chenming.education.user.manager;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenming.education.user.entity.UserLogLogin;
import com.chenming.education.user.mapper.UserLogLoginMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户错误登录日志 服务实现类
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Service
public class UserLogLoginManager extends ServiceImpl<UserLogLoginMapper, UserLogLogin> {

}
