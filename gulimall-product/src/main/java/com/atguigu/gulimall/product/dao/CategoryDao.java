package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author aurora
 * @email aurora@gmail.com
 * @date 2024-01-20 19:34:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
