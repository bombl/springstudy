package com.think.in.java;/**
 * @Author: wangs
 * @Date: 2018/9/22
 */

/**
 * Description:
 * User:wangs
 * Date:2018/9/22
 */
public class HelloWorld {

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
}
