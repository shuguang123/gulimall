package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author aurora
 * @email aurora@gmail.com
 * @date 2024-01-20 22:39:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
