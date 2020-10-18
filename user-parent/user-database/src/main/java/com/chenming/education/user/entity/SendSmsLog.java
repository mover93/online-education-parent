package com.chenming.education.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户发送短信日志
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SendSmsLog implements Serializable {

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
     * 短信模板
     */
    private String template;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 验证码
     */
    private String smsCode;

    /**
     * 是否发送成功(1发送成功，0:发送失败)
     */
    private Integer isSuccess;


}
