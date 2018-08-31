package com.ppx.hellomall.service;

import com.ppx.hellomall.entity.Booktype;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hucongting
 * @since 2018-08-31
 */
public interface IBooktypeService extends IService<Booktype> {
	/**
	 * 两表查询
	 * @return
	 */
	public List<Booktype> selectBookTypeInfoList();
}
