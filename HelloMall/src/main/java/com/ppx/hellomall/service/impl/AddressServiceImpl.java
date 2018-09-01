package com.ppx.hellomall.service.impl;

import com.ppx.hellomall.entity.Address;
import com.ppx.hellomall.mapper.AddressDao;
import com.ppx.hellomall.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressDao, Address> implements IAddressService {
	
}
