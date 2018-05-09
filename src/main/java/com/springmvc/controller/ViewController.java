package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller(value = "viewController")
@RequestMapping("/user")
public class ViewController {

    private Logger logger = Logger.getLogger(ViewController.class);

    @Resource(name="userService")
    private UserService UserService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/haha")
    public ModelAndView getView() {
        ModelAndView modelAndView=new ModelAndView("Outting");
        modelAndView.addObject("name","xxx");
        return modelAndView;
    }


    @RequestMapping("/find")
    @ResponseBody
    public ModelAndView find(User user,@RequestParam("username")String username, @RequestParam("password")String password){
        ModelAndView modelAndView;
        Map<String,Object> map = new HashMap();
        User loginUser =  UserService.findUserByNameAndPassword(username,password);
        if(loginUser == null){
            modelAndView=new ModelAndView("error");
            map.put("result","fail");
        }else{
            modelAndView=new ModelAndView("success");
            map.put("user",loginUser);
            map.put("result","success");
            modelAndView.addObject("map",map);
        }
        return modelAndView;
    }

    @RequestMapping("/success")
    public String success(){

        return "success";
    }

}
