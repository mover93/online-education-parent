package com.chenming.education.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 后台操作日志表
 * </p>
 *
 * @author chenming
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysLog implements Serializable {

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
     * 操作人
     */
    private Long userNo;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 用户操作
     */
    private String operation;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求路径
     */
    private String path;

    /**
     * 请求参数
     */
    private String content;


}
