package com.mashibing.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @decription: iLoveSh handler
 * @date: 2022/6/23 17:29
 * @author: longjunjie@xinpayroll.com
 * @Since:
 */
public class ILoveShNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        this.registerBeanDefinitionParser("shhui", new ILoveShBeanDefinitionParser());
    }
}
