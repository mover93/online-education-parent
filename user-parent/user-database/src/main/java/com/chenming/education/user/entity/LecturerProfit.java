package com.chenming.education.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 讲师提现日志表
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LecturerProfit implements Serializable {

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
     * 讲师用户编号
     */
    private Long lecturerUserNo;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行支行名称
     */
    private String bankBranchName;

    /**
     * 银行开户名
     */
    private String bankUserName;

    /**
     * 银行身份证号
     */
    private String bankIdCardNo;

    /**
     * 讲师收入
     */
    private BigDecimal lecturerProfit;

    /**
     * 平台收入
     */
    private BigDecimal platformProfit;

    /**
     * 分润状态（1确认中，2成功，3失败）
     */
    private Integer profitStatus;

    /**
     * 备注
     */
    private String remark;


}
