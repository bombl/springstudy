package com.think.in.java.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author Caijh
 * <p>
 * 2017年7月11日 下午3:53:19
 */
@Component("knight")
public class BraveKnight {
    public void saying() {
        System.out.println("我是骑士..（切点方法）");
    }
}