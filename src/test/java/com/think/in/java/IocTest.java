package com.think.in.java;/**
 * @Author: wangs
 * @Date: 2018/9/22
 */

import com.sun.jndi.toolkit.url.Uri;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import javax.annotation.Resource;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
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
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/bean.xml");
        System.out.println(context.getBean("helloWorld", HelloWorld.class).getName());
    }

    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory =
                new XmlBeanFactory(new FileSystemResource("src/main/resources/bean.xml"));
        HelloWorld helloWorld = beanFactory.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();
    }

    @Test
    public void testMyApplicationContext() {
        Properties properties = System.getProperties();
        properties.setProperty("aaa", "bbb");
        ApplicationContext applicationContext = new MyApplicationContext();
    }

    @Test
    public void testIsAbsolute() throws Exception {
        URI uri = new URI("http://myUrl/%2E%2E/%2E%2E");
        URI uri2 = new URI("ftp://myUrl/%2E%2E/%2E%2E");
        System.out.println(uri2.isAbsolute());
    }

    @Test
    public void testProfile() {
        Properties properties = System.getProperties();
        properties.setProperty("spring.profiles.active","dev");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/bean.xml");
        context.getBean("helloWorld", HelloWorld.class).sayHello();
    }

}
