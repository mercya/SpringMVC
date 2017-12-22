package com.springmvc.dao;


import com.springmvc.entity.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentsMapper")
public interface StudentsMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);

    List<Students> findAllStudents();
}