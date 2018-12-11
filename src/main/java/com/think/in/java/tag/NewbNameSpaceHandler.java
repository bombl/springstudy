/**
 * 文件名称:          	NewbNameSpaceHandler
 * 版权所有@ 2017-2018 	魔谐(上海)软件有限公司，保留所有权利
 * 编译器:           	JDK1.8
 */

package com.think.in.java.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * TODO: 文件注释
 * <p>
 * Version		1.0.0
 *
 * @author wangshuai
 * <p>
 * Date	      2018/12/11 18:26
 */
public class NewbNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("newb",new NewbBeanDefinitionParser());
    }
}
