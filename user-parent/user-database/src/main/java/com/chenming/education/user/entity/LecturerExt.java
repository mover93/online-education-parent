package com.chenming.education.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 讲师账户信息表
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LecturerExt implements Serializable {

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
     * 讲师用户编号
     */
    private Long lecturerUserNo;

    /**
     * 总收入
     */
    private BigDecimal totalIncome;

    /**
     * 已提金额
     */
    private BigDecimal historyMoney;

    /**
     * 可提余额
     */
    private BigDecimal enableBalances;

    /**
     * 冻结金额
     */
    private BigDecimal freezeBalances;

    /**
     * sign
     */
    private String sign;

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


}
