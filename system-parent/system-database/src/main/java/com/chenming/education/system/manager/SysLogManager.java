package com.chenming.education.system.manager;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenming.education.system.entity.SysLog;
import com.chenming.education.system.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台操作日志表 服务实现类
 * </p>
 *
 * @author chenming
 * @since 2020-09-12
 */
@Service
public class SysLogManager extends ServiceImpl<SysLogMapper, SysLog> {

}
