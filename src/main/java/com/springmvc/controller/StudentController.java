package com.springmvc.controller;

import com.springmvc.entity.Students;
import com.springmvc.service.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by eCRF on 2017/12/22.
 */
@Controller
@RequestMapping
public class StudentController {

    @Resource(name = "studentsService")
    private StudentsService studentsService;

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    @ResponseBody
    public List<Students> findall(){
        return studentsService.findAllStudents();
    }
}
