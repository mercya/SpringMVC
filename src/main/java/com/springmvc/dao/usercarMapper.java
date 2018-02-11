package com.springmvc.dao;


import com.springmvc.entity.usercarKey;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("usercarmapper")
public interface usercarMapper {
    int deleteByPrimaryKey(usercarKey key);

    int insert(usercarKey record);

    int insertSelective(usercarKey record);

    List<usercarKey> findForListbyOpenid(String openid);

}