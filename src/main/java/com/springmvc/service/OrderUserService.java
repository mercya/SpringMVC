package com.springmvc.service;

import com.springmvc.entity.orderuser;

import java.util.List;

/**
 * Created by eCRF on 2018/2/5.
 */
public interface OrderUserService {

    public orderuser findbyOpenid(String openId);

}
