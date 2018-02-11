package com.springmvc.service.impl;

import com.springmvc.dao.orderuserMapper;
import com.springmvc.entity.orderuser;
import com.springmvc.service.OrderUserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by eCRF on 2018/2/5.
 */
@Service("orderUserservice")
public class OrderUserServiceImpl implements OrderUserService {

    @Resource(name = "orderuserMapper")
    private orderuserMapper orderuserMapper;

    @Override
    public orderuser findbyOpenid(String openId) {
        return orderuserMapper.selectByPrimaryKey(openId);
    }
}
