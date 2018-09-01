package com.ppx.hellomall.service.impl;

import com.ppx.hellomall.entity.Booktype;
import com.ppx.hellomall.mapper.BooktypeDao;
import com.ppx.hellomall.service.IBooktypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hucongting
 * @since 2018-08-31
 */
@Service
public class BooktypeServiceImpl extends ServiceImpl<BooktypeDao, Booktype> implements IBooktypeService {

	@Autowired
	private BooktypeDao bookTypeDao;

	public List<Booktype> selectBookTypeInfoList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
