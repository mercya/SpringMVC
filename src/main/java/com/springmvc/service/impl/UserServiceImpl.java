package com.springmvc.service.impl;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserDao")
    private UserDao userDao;
//
//    @Override
//    public User findUserByNameAndPassword(String username, String password) {
//        return UserMapper.findByNameAndPassword(username,password);
//    }
    @Override
    public User findUserByNameAndPassword(String username, String password) {
        return userDao.findByNameAndPassword(username,password);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer stuId) {
        return userDao.selectByPrimaryKey(stuId);
    }

    @Override
    public List<User> find() {
        return userDao.find();
    }
}
