/**
 * 文件名称:          	NewbBeanDefinitionParser
 * 版权所有@ 2017-2018 	魔谐(上海)软件有限公司，保留所有权利
 * 编译器:           	JDK1.8
 */

package com.think.in.java.tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * TODO: 文件注释
 * <p>
 * Version		1.0.0
 *
 * @author wangshuai
 * <p>
 * Date	      2018/12/11 18:28
 */
public class NewbBeanDefinitionParser extends AbstractSingleBeanDefinitionParser  {
    @Override
    protected Class<?> getBeanClass(Element element) {
        return super.getBeanClass(element);
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        super.doParse(element, builder);
    }
}
