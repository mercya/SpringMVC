package com.springmvc.service.impl;

import com.springmvc.dao.StudentsMapper;
import com.springmvc.entity.Students;
import com.springmvc.service.StudentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by eCRF on 2017/12/22.
 */
@Service("studentsService")
public class StudentsServiceImpl implements StudentsService {

    @Resource(name = "studentsMapper")
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> findAllStudents() {
        return studentsMapper.findAllStudents();
    }
}
