package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by eCRF on 2018/1/12.
 */
@Controller
@RequestMapping("boy")
public class BoyController {

    @Resource(name ="userService")
    UserService userService;


//    BitSet

    @RequestMapping(value = "/gay",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> finda(@RequestParam("username")String username, @RequestParam("password")String password, HttpServletRequest request){
        List<User> list= userService.find();
        Map<String,Object> map=new HashMap();
        map.put("result",list);
        return map;
    }
}
