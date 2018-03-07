package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.entity.goodsdetail;
import com.springmvc.entity.orderuser;
import com.springmvc.entity.usercarKey;
import com.springmvc.service.GoodsService;
import com.springmvc.service.OrderUserService;
import com.springmvc.service.usercarService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by eCRF on 2018/2/2.
 */
@Controller
public class GoodsController {
    @Resource(name = "goodsService")
    private GoodsService goodsService;
    //orderuserMapper
    @Resource(name = "orderUserservice")
    private OrderUserService orderUserService;

    @Resource(name = "usercarService")
    private usercarService usercarService;


    //查看user的key值
    @RequestMapping(value = "/usercarkey",method = RequestMethod.GET)
    @ResponseBody
    public List<usercarKey> getuserCarKey(@RequestParam("openid")String openid){
        return usercarService.findForListbyOpenid(openid);
    }


    //查找单个用户信息
    @RequestMapping(value = "/userdetail",method = RequestMethod.GET)
    @ResponseBody
    public orderuser getOrderUser(@RequestParam("openid")String openid){
        return orderUserService.findbyOpenid(openid);
    }


    //查找全部的商品信息
    @RequestMapping(value = "/goodsList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> finda(){
        Map<String,Object> map = new HashedMap();
        List<goodsdetail> goods = goodsService.findAllGoods();
        map.put("","");
        if(goods.size()==0){
            map.put("result",0);
        }else{
            map.put("result",1);
            map.put("goodslist",goods);
        }
        return map;
    }
    //根据商品的ID查找商品的信息
    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    @ResponseBody
    public goodsdetail findgoods(@RequestParam("goodsid")int goodsid){
        goodsdetail goods=goodsService.findGoodsby(goodsid);
        //后期需要修改判断存不存在该
        return goods;
    }
}
