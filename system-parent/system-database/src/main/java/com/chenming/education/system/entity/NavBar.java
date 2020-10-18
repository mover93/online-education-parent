package com.chenming.education.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 头部导航
 * </p>
 *
 * @author chenming
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class NavBar implements Serializable {

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
     * 状态(1有效, 0无效)
     */
    private Integer statusId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 导航标题
     */
    private String navTitle;

    /**
     * 导航url
     */
    private String navUrl;

    /**
     * 跳转方式
     */
    private String target;


}
