package com.springmvc.service;

import com.springmvc.entity.Students;
import com.springmvc.entity.User;

import java.util.List;


public interface UserService {


    public User findUserByNameAndPassword(String username, String password);

    public int insertUser(User user);

    public User selectByPrimaryKey(Integer stuId);

    public List<User> find();
}
