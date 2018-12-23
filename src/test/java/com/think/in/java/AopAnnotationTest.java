package com.think.in.java;

import com.think.in.java.aop.annotation.BraveKnight;
import com.think.in.java.aop.declareparents.Service;
import com.think.in.java.aop.declareparents.User;
import com.think.in.java.aop.declareparents.Verifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

public class AopAnnotationTest {


    @Test
    public void testAnnotationAop() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        BraveKnight br = (BraveKnight) ac.getBean("knight");
        br.saying();
    }
}
