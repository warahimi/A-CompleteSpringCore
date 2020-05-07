package com.A2IoCUsingXMLandInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("A2.xml");
		Teacher teacher = context.getBean("teach", Teacher.class);
		teacher.Teach();

	}

}
