package com.ppx.hellomall.mapper;

import com.ppx.hellomall.entity.Booktype;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author hucongting
 * @since 2018-08-31
 */
public interface BooktypeDao extends BaseMapper<Booktype> {

	/**
	 * 两表查询
	 * @return
	 */
	public List<Booktype> selectBookTypeInfoList();
	
}