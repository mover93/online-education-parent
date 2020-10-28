package com.chenming.education.system.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * description: SysUserDto <br>
 * author: chenming <br>
 * date: 2020/10/28 21:30 <br>
 * version: 1.0 <br>
 */
@Data
public class SysUserDto implements Serializable {

    private static final long serialVersionUID = -4194405588981785039L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;

    /**
     * 状态(1:正常，0:禁用)
     */
    private Integer statusId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 用户编号
     */
    private Long userNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 备注
     */
    private String remark;
}
