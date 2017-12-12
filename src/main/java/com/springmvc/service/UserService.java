package com.springmvc.service;

import com.springmvc.entity.User;

/**
 * @Remark :
 **/
public interface UserService {


    /**
      * @param  :
      * @return : 
      * @author : zw
      * @Date   : 2017/5/5
    **/
    public User findUserByNameAndPassword(String username, String password);
}
