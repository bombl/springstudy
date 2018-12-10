/**
 * 文件名称:          	MyBeanPostProcessor
 * 版权所有@ 2017-2018 	魔谐(上海)软件有限公司，保留所有权利
 * 编译器:           	JDK1.8
 */

package com.think.in.java.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * TODO: 文件注释
 * <p>
 * Version		1.0.0
 *
 * @author wangshuai
 * <p>
 * Date	      2018/11/12 18:55
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }
}
