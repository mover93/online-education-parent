package com.chenming.education.user.dubbo.service.impl;

import com.chenming.education.user.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * description: UserDubboServiceImpl <br>
 * author: chenming <br>
 * date: 2020/10/18 16:44 <br>
 * version: 1.0 <br>
 */
@DubboService
public class UserDubboServiceImpl implements UserService {

    @Override
    public String echo(String msg) {
        return "hello" + msg;
    }
}
