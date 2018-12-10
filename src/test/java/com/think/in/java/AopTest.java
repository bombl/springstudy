package com.think.in.java;

import com.think.in.java.aop.declareparents.Service;
import com.think.in.java.aop.declareparents.User;
import com.think.in.java.aop.declareparents.Verifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config.xml"})
public class AopTest {

    @Resource
    private Service service;

    @Test
    public void testDecareParents() {
        User user1 = new User();
        user1.setUsername("jack");
        user1.setPassword("1234");
        Verifier v = (Verifier) service;
        if(v.validate(user1)) {
            System.out.println("验证成功");
            service.doSomething();
        }
    }
}
