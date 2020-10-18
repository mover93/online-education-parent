package com.chenming.education.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户修改日志
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserLogModified implements Serializable {

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
     * 原手机号
     */
    private String mobileOld;

    /**
     * 新手机
     */
    private String mobileNew;

    /**
     * 备注
     */
    private String remark;


}
