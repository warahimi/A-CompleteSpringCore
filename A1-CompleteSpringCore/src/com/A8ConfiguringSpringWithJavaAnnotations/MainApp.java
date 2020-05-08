package com.A8ConfiguringSpringWithJavaAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("A8.xml"); 
		Teacher teacher = context.getBean("mathTeacher", Teacher.class);
		

		teacher.Teach();
		teacher.takeSubjectExam(); 
		
		
		//close the context
		((ClassPathXmlApplicationContext)context).close();
	}

}














































































