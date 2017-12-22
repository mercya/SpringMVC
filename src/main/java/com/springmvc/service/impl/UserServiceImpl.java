package com.springmvc.service.impl;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;
//
//    @Override
//    public User findUserByNameAndPassword(String username, String password) {
//        return UserMapper.findByNameAndPassword(username,password);
//    }
    @Override
    public User findUserByNameAndPassword(String username, String password) {
        return userMapper.findByNameAndPassword(username,password);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer stuId) {
        return userMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public List<User> find() {
        return userMapper.find();
    }
}
