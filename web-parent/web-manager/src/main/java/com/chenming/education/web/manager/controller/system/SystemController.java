package com.chenming.education.web.manager.controller.system;

import com.chenming.education.user.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: SystemController <br>
 * author: chenming <br>
 * date: 2020/10/18 17:39 <br>
 * version: 1.0 <br>
 */
@RestController
@RequestMapping(value = "/api/system")
public class SystemController {

    @DubboReference
    private UserService userService;

    @GetMapping(value = "/{msg}")
    public String echo(@PathVariable(value = "msg") String msg) {
        return userService.echo(msg);
    }
}
