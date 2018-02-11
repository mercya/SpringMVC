package com.springmvc.dao;

import com.springmvc.entity.goodsdetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("goodsdetailmapper")
public interface goodsdetailMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(goodsdetail record);

    int insertSelective(goodsdetail record);

    goodsdetail selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(goodsdetail record);


    int updateByPrimaryKey(goodsdetail record);

    List<goodsdetail> findAllgoods();
}