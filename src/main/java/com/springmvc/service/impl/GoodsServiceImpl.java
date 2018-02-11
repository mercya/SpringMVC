package com.springmvc.service.impl;

import com.springmvc.dao.goodsdetailMapper;
import com.springmvc.entity.goodsdetail;
import com.springmvc.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by eCRF on 2018/2/2.
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {


    //通过Resource需要添加 mapper的对象

    @Resource(name = "goodsdetailmapper")
    private goodsdetailMapper goodsdetailMapper;

    //单商品查询
    @Override
    public goodsdetail findGoodsby(int goodsid) {
        return goodsdetailMapper.selectByPrimaryKey(goodsid);
    }
    //查找出所有的商品
    @Override
    public List<goodsdetail> findAllGoods() {
        return goodsdetailMapper.findAllgoods();
    }
}
