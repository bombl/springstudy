package com.think.in.java;/**
 * @Author: wangs
 * @Date: 2018/9/22
 */

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Description:
 * User:wangs
 * Date:2018/9/22
 */
public class HelloWorld implements MethodReplacer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HelloWorld() {
        System.out.println("实例化");
    }

    public void sayHello() {
        System.out.println("hello world!");
    }

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("方法已经被替换!");
        return null;
    }
}
