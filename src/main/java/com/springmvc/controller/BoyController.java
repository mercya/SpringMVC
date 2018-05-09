package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.HiddenHttpMethodFilter;

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
//    HiddenHttpMethodFilter

    @RequestMapping(value = "/gay",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> finda(HttpServletRequest request){
        request.getParameter("txtLoginID");
        request.getParameter("txtPwd");

//      @RequestParam("txtLoginID")String username, @RequestParam("txtPwd")String password,
        List<User> list= userService.find();
        Map<String,Object> map=new HashMap();
        map.put("Code",0);
        map.put("Description","3120402");
        map.put("sessionid",request.getSession().getId());
        map.put("fullname","米护士");
        map.put("title","研究者");
        return map;
    }
}
