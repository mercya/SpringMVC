package com.springmvc.service;

import com.springmvc.entity.goodsdetail;

import java.util.List;

/**
 * Created by eCRF on 2018/2/2.
 */
public interface GoodsService {
    public goodsdetail findGoodsby(int goodsid);
    public List<goodsdetail> findAllGoods();
}
