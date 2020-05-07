package com.A3DIUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("A3.xml"); // builds the object and injects the approprait dependencies
		Teacher teacher = context.getBean("teach", Teacher.class);
		teacher.Teach();
		teacher.takeSubjectExam(); 
		//teacher is fully assembled object
	}

}
