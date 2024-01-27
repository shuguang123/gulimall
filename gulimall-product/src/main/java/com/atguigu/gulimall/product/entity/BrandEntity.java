package com.atguigu.gulimall.product.entity;

import java.io.Serializable;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.URL;

import com.atguigu.common.valid.AddGroup;
import com.atguigu.common.valid.ListValue;
import com.atguigu.common.valid.UpdateGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 品牌
 * 
 * @author aurora
 * @email aurora@gmail.com
 * @date 2024-01-20 19:34:23
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @NotNull(message = "修改必须指定品牌id", groups = {UpdateGroup.class})
    @Null(message = "新增不能指定id", groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    // @NotBlank(message = "品牌名必须非空")
    @NotEmpty
    @NotBlank(message = "品牌名必须非空", groups = {UpdateGroup.class, AddGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotEmpty
    @URL(message = "Logo必须是一个合法的URL地址")
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @ListValue(value = {0, 1}, groups = {AddGroup.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty
    @Pattern(regexp = "/^[a-zA-Z]$/", message = "检索首字母必须是一个字母")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull
    @Min(value = 0, message = "排序必须大于等于0")
    private Integer sort;

}
