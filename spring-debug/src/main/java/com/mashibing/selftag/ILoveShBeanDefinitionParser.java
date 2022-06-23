package com.mashibing.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @decription:
 * @date: 2022/6/23 17:36
 * @author: longjunjie@xinpayroll.com
 * @Since:
 */
public class ILoveShBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return ShaohuiInfo.class;
    }

    @Override
    protected boolean shouldGenerateId() {
        return true;
    }

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String job = element.getAttribute("job");
        String faceScore = element.getAttribute("faceScore");
        String doForHer = element.getAttribute("doForHer");

        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(job)) {
            builder.addPropertyValue("job", job);
        }
        if (StringUtils.hasText(faceScore)) {
            builder.addPropertyValue("faceScore", faceScore);
        }
        if (StringUtils.hasText(doForHer)) {
            builder.addPropertyValue("doForHer", doForHer);
        }

    }


}
