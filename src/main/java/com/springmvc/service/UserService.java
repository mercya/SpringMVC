package com.springmvc.service;

import com.springmvc.entity.User;


public interface UserService {


    public User findUserByNameAndPassword(String username, String password);
}
