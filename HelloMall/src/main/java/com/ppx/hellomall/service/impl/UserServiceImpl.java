package com.ppx.hellomall.service.impl;

import com.ppx.hellomall.entity.User;
import com.ppx.hellomall.mapper.UserDao;
import com.ppx.hellomall.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
	
}
