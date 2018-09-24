package com.think.in.java;/**
 * @Author: wangs
 * @Date: 2018/9/24
 */

import org.springframework.context.support.AbstractXmlApplicationContext;

/**
 * Description:
 * User:wangs
 * Date:2018/9/24
 */
public class MyApplicationContext extends AbstractXmlApplicationContext {
    public MyApplicationContext () {
        getEnvironment().setRequiredProperties("aaa");
        refresh();
    }

}
