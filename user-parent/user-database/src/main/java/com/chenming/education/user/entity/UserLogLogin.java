package com.chenming.education.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户错误登录日志
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserLogLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 用户编号
     */
    private Long userNo;

    /**
     * 客户端ID
     */
    private String clientId;

    /**
     * 登录状态(1成功，0失败)
     */
    private Integer loginStatus;

    /**
     * 登录IP
     */
    private String loginIp;


}
