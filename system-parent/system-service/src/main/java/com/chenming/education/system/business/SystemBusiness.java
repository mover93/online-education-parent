package com.chenming.education.system.business;

import com.chenming.education.user.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * description: SystemBusiness <br>
 * author: chenming <br>
 * date: 2020/10/18 17:00 <br>
 * version: 1.0 <br>
 */
@Component
public class SystemBusiness {

    @DubboReference
    private UserService userService;

    public String echo(String msg) {
        return userService.echo(msg);
    }
}
