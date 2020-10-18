package com.chenming.education.user.manager;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenming.education.user.entity.Region;
import com.chenming.education.user.mapper.RegionMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 行政区域表 服务实现类
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Service
public class RegionManager extends ServiceImpl<RegionMapper, Region> {

}
