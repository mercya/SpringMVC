package com.springmvc.service.impl;

import com.springmvc.dao.StudentsMapper;
import com.springmvc.dao.usercarMapper;
import com.springmvc.entity.usercarKey;
import com.springmvc.service.usercarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by eCRF on 2018/2/8.
 */
@Service("usercarService")
public class usercarServiceImpl implements usercarService {

    @Resource(name = "usercarmapper")
    private usercarMapper usercarmapper;


    @Override
    public List<usercarKey> findForListbyOpenid(String openid) {
        return usercarmapper.findForListbyOpenid(openid);
    }
}
