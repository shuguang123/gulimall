package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author aurora
 * @email aurora@gmail.com
 * @date 2024-01-20 22:34:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
