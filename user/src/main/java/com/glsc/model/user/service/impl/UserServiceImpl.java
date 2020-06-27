package com.glsc.model.user.service.impl;

import com.glsc.model.user.bean.pojo.User;
import com.glsc.model.user.mapper.UserMapper;
import com.glsc.model.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年06月27日 18:04
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUSer() {
        return userMapper.getUser();
    }
}
