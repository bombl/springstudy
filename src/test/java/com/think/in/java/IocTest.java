package com.think.in.java;/**
 * @Author: wangs
 * @Date: 2018/9/22
 */

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Description:
 * User:wangs
 * Date:2018/9/22
 */
public class IocTest {

    @Autowired
    @Resource

    @Test
    public void testApplicationContext() {
        Properties properties = System.getProperties();
        properties.setProperty("aaaa", "bbbb");
        properties.setProperty("bbbb", "src/main/resources/bean.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("${${aaaa}}");
        context.getBean("helloWorld",HelloWorld.class).sayHello();
    }
    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory =
                new XmlBeanFactory(new FileSystemResource("src/main/resources/bean.xml"));
        HelloWorld helloWorld = beanFactory.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();
    }

}
