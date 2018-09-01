package com.ppx.hellomall.service.impl;

import com.ppx.hellomall.entity.Comment;
import com.ppx.hellomall.mapper.CommentDao;
import com.ppx.hellomall.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements ICommentService {
	
}
