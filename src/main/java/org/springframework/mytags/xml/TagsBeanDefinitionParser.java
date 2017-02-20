package org.springframework.mytags.xml;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

public class TagsBeanDefinitionParser extends AbstractBeanDefinitionParser {
	protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {
		return parseAElement(element);
	}

	private static AbstractBeanDefinition parseAElement(Element element) {
		BeanDefinitionBuilder factory = BeanDefinitionBuilder.rootBeanDefinition(TagsFactoryBean.class);
		factory.addPropertyValue("a", parseA(element));

		return factory.getBeanDefinition();
	}

	private static BeanDefinition parseA(Element element) {
		BeanDefinitionBuilder component = BeanDefinitionBuilder.rootBeanDefinition(A.class);
		component.addPropertyValue("id", element.getAttribute("id"));
		component.addPropertyValue("name", element.getAttribute("name"));
		
		List<Element> childBElements = DomUtils.getChildElementsByTagName(element, "B");
		ManagedList<BeanDefinition> children = new ManagedList<BeanDefinition>(childBElements.size());
		for (Element item : childBElements) {
			children.add(parseB(item));
		}
		
		component.addPropertyValue("bList", children);
		return component.getBeanDefinition();
	}

	private static BeanDefinition parseB(Element element) {
		BeanDefinitionBuilder component = BeanDefinitionBuilder.rootBeanDefinition(B.class);
		component.addPropertyValue("id", element.getAttribute("id"));
		component.addPropertyValue("name", element.getAttribute("name"));
		
		List<Element> childCElements = DomUtils.getChildElementsByTagName(element, "C");
		ManagedList<BeanDefinition> children = new ManagedList<BeanDefinition>(childCElements.size());
		for (Element item : childCElements) {
			children.add(parseC(item));
		}
		
		component.addPropertyValue("cList", children);
		return component.getBeanDefinition();
	}

	private static BeanDefinition parseC(Element element) {
		BeanDefinitionBuilder component = BeanDefinitionBuilder.rootBeanDefinition(C.class);
		component.addPropertyValue("id", element.getAttribute("id"));
		component.addPropertyValue("name", element.getAttribute("name"));
		return component.getBeanDefinition();
	}

}