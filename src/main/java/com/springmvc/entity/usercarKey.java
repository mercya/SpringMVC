package com.springmvc.entity;

import java.util.List;

public class usercarKey {
    private String cardetailid;

    private String openid;

    private List<goodsdetail> goodsdetails;

    public List<goodsdetail> getGoodsdetails() {
        return goodsdetails;
    }

    public void setGoodsdetails(List<goodsdetail> goodsdetails) {
        this.goodsdetails = goodsdetails;
    }

    public String getCardetailid() {
        return cardetailid;
    }

    public void setCardetailid(String cardetailid) {
        this.cardetailid = cardetailid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

}