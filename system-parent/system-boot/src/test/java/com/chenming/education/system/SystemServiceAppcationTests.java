package com.chenming.education.system;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenming.education.system.entity.SysMenu;
import com.chenming.education.system.entity.SysUser;
import com.chenming.education.system.manager.SysMenuManager;
import com.chenming.education.system.manager.SysUserManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * description: SystemServiceAppcationTests <br>
 * author: chenming <br>
 * date: 2020/10/18 11:38 <br>
 * version: 1.0 <br>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemServiceAppcationTests {

    @Autowired
    private SysUserManager sysUserManager;

    @Autowired
    private SysMenuManager sysMenuManager;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testQuerySysUser() {
        SysUser sysUser = sysUserManager.getById(1);
        System.out.println(JSON.toJSONString(sysUser));
    }

    @Test
    public void testPageSysMenuList() {
        Page<SysMenu> page = sysMenuManager.page(new Page<>(1, 10));
        System.out.println(JSON.toJSONString(page));
    }
}
