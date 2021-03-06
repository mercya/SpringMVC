package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eCRF on 2017/12/15.
 */
@Controller
@RequestMapping
public class MainController {

    private Logger logger = Logger.getLogger(MainController.class);

    @Resource(name="userService")
    private UserService UserService;

    @RequestMapping(value = "/studentinfo",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getStudent(@RequestParam("username")String username, @RequestParam("password")String password, HttpServletRequest request){
        Map<String,Object> map = new HashMap();
        User loginUser = UserService.findUserByNameAndPassword(username,password);
        if(loginUser == null){
            map.put("result","fail");
        }else{
            map.put("result","success");
            map.put("user",loginUser);
        }
        return map;
    }
}
