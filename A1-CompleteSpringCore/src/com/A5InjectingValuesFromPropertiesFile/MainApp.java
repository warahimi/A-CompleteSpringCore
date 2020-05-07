package com.A5InjectingValuesFromPropertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("A5.xml"); 
		Teacher teacher = context.getBean("teach", Teacher.class);
		teacher.Teach();
		teacher.takeSubjectExam(); 
		//teacher is fully assembled object
	}

}














































































