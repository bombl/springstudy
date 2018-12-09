package com.think.in.java;

import com.think.in.java.aop.dynamic.MyInvocationHandler;
import com.think.in.java.aop.dynamic.HelloImpl;
import com.think.in.java.aop.dynamic.IHello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.lang.reflect.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class JdkDynamicTest {

    @Test
    public void testJdkDynamicProxy1() throws Exception {
        //生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(),IHello.class);
        //获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        //通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        IHello iHello = (IHello) constructor.newInstance(new MyInvocationHandler(new HelloImpl()));
        //通过代理对象调用目标方法
        iHello.sayHello();
    }

    @Test
    public void testJdkDynamicProxy2() {
        //生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IHello  ihello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),  //加载接口的类加载器
                new Class[]{IHello.class},      //一组接口
                new MyInvocationHandler(new HelloImpl())); //自定义的InvocationHandler
        ihello.sayHello();

    }
}
