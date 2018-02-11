package com.springmvc.service;

import com.springmvc.entity.usercarKey;

import java.util.List;

/**
 * Created by eCRF on 2018/2/8.
 */
public interface usercarService {

   List<usercarKey> findForListbyOpenid(String openid);
}
