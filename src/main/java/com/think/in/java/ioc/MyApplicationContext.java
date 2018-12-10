package com.think.in.java.ioc;/**
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

    @Override
    protected void initPropertySources() {
        System.out.println("aa");
        super.initPropertySources();
    }
}
