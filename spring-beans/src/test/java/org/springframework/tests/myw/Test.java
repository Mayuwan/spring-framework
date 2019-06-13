package org.springframework.tests.myw;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test {
	@org.junit.Test
	public void loadBeanDefinitionTest(){
		ClassPathResource classPathResource = new ClassPathResource("bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(classPathResource);
	}
}
