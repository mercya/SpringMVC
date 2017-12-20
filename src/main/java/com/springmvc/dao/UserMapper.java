package com.springmvc.dao;

import com.springmvc.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
      * 根据用户名和密码获取用户
      * @param  :
      * @return
    **/
    public User findByNameAndPassword(@Param("username")String username,@Param("password") String password);

    /**
      * 获取用户
      * @param  :
      * @return : 
    **/
    public List<User> find();

    /**
      * 更新
      * @param  :
      * @return :
    **/
    public void updateUser(User user);
}