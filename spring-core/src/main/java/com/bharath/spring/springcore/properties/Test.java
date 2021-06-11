package com.bharath.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String...args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/properties/propertiesconfig.xml");
		Languages languages = (Languages) ctx.getBean("languages");
		System.out.println(languages);
	}
}
