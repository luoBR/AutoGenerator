package com.shineyue.blog.service.impl;

import com.shineyue.blog.entity.User;
import com.shineyue.blog.mapper.UserMapper;
import com.shineyue.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 罗秉荣
 * @since 2020-10-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
