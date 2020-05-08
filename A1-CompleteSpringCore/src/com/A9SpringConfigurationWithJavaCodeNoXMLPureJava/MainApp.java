package com.A9SpringConfigurationWithJavaCodeNoXMLPureJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class); 
		Teacher teacher = context.getBean("scienceTeacher", Teacher.class);
		

		teacher.Teach();
		teacher.takeSubjectExam(); 
		
		
		//close the context
		context.close();
	}

}














































































