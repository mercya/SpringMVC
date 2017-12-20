package com.springmvc.service.impl;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.Students;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


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

    @Override
    public int insertUser(User user) {
        return UserMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer stuId) {
        return UserMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public List<User> find() {
        return UserMapper.find();
    }
}
