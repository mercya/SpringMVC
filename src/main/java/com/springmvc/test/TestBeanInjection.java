package com.springmvc.test;

import com.springmvc.dao.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * Created by eCRF on 2017/12/22.
 */
public class TestBeanInjection extends AbstractDependencyInjectionSpringContextTests {
    @Test
    public void testBen(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-mvc.xml");
        UserMapper text= (UserMapper) context.getBean("userMapper");

    }
}
