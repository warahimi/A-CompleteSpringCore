package com.A6BeansScopeLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("A6.xml"); 
		Teacher teacher1 = context.getBean("teach", Teacher.class);
		Teacher teacher2 = context.getBean("teach", Teacher.class);

		//check if the are same beans?
		boolean result = (teacher1 == teacher2); // comparing these 2 object reference to see if they are pointing to the same areas of memory 
		
		//print out the result
		System.out.println("Pointing to the same object: "+result);
		System.out.println("\nMemory location for teacher1: "+teacher1);
		System.out.println("\nMemory location for teacher2: "+teacher2);
		
		
//		teacher1.Teach();
//		teacher1.takeSubjectExam(); 
		
		
		//close the context
		((ClassPathXmlApplicationContext)context).close();
	}

}














































































