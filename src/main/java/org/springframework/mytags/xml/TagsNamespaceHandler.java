package org.springframework.mytags.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class TagsNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("A", new TagsBeanDefinitionParser());
    }

}