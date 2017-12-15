package com.springmvc.service.impl;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserMapper")
    private UserMapper UserMapper;
//
//    @Override
//    public User findUserByNameAndPassword(String username, String password) {
//        return UserMapper.findByNameAndPassword(username,password);
//    }
    @Override
    public User findUserByNameAndPassword(String username, String password) {
        return UserMapper.findByNameAndPassword(username,password);
    }
}
