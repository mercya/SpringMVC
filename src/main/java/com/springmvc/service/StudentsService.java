package com.springmvc.service;

import com.springmvc.entity.Students;

import java.util.List;

/**
 * Created by eCRF on 2017/12/22.
 */
public interface StudentsService {
    List<Students> findAllStudents();
}
