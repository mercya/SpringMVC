package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class ViewController {

    private Logger logger = Logger.getLogger(ViewController.class);

    @Resource(name="UserService")
    private UserService UserService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find(User user, HttpServletRequest request){

        Map<String,Object> map = new HashedMap();
        User loginUser = UserService.findUserByNameAndPassword(user.getUsername(),user.getPassword());
        if(loginUser == null){
            map.put("result","fail");
        }else{
            map.put("result","success");
        }
        return map;
    }

    @RequestMapping("/success")
    public String success(){

        return "success";
    }

}
