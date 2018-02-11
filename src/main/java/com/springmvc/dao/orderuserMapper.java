package com.springmvc.dao;

import com.springmvc.entity.orderuser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderuserMapper")
public interface orderuserMapper {
    int deleteByPrimaryKey(String openid);

    int insert(orderuser record);

    int insertSelective(orderuser record);

    orderuser selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(orderuser record);

    int updateByPrimaryKey(orderuser record);

    public List<orderuser> findAllsUers();
}