package com.chenming.education.system.controller;

import com.chenming.education.system.business.SystemBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: SystemController <br>
 * author: chenming <br>
 * date: 2020/10/18 17:02 <br>
 * version: 1.0 <br>
 */
@RestController
@RequestMapping(value = "/system")
public class SystemController {

    @Autowired
    private SystemBusiness systemBusiness;

    @GetMapping(value = "/{msg}")
    public String echo(@PathVariable(value = "msg") String msg) {
        return systemBusiness.echo(msg);
    }
}
