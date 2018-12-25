package com.think.in.java.aop.annotation;

/**
 * @author Caijh
 *
 * 2017年7月11日 下午3:47:04
 */
public class Minstrel {
    public void beforSay(){
        System.out.println("前置通知");
    }
    
    public void afterSay(){
        System.out.println("后置通知");
    }
}