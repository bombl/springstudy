package com.think.in.java;

import com.think.in.java.tag.Newb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:tag.xml"})
public class TagTest {

    @Test
    public void testCustomTag() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tag.xml");
        Newb newb = applicationContext.getBean(Newb.class);
        System.out.println(newb.getId() + ", " + newb.getName() + ", " + newb.getAge());
    }
}
