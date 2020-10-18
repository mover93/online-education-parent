package com.chenming.education.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 行政区域表
 * </p>
 *
 * @author chenming
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 区域编码（国标）
     */
    private String provinceCode;

    /**
     * 中心经度
     */
    private BigDecimal centerLng;

    /**
     * 中心维度
     */
    private BigDecimal centerLat;

    /**
     * 省Id
     */
    private Integer provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市Id
     */
    private Integer cityId;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 市名称
     */
    private String cityName;

    /**
     * 区域名称
     */
    private String regionName;

    /**
     * 区名称
     */
    private String districtName;

    /**
     * 全路径名称
     */
    private String mergerName;


}
