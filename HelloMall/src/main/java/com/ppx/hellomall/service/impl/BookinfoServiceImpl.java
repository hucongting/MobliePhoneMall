package com.ppx.hellomall.service.impl;

import com.ppx.hellomall.entity.Bookinfo;
import com.ppx.hellomall.mapper.BookinfoDao;
import com.ppx.hellomall.service.IBookinfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hucongting
 * @since 2018-08-31
 */
@Service
public class BookinfoServiceImpl extends ServiceImpl<BookinfoDao, Bookinfo> implements IBookinfoService {
	
}
