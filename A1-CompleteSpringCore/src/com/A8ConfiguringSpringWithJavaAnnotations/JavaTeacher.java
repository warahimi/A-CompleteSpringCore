package com.A8ConfiguringSpringWithJavaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements Teacher {

	//literal values
	@Value("22")
	private int age;
	@Value("ALi")
	private String name ;
	//objective types
	@Autowired
	private ExamDepartment examDepartment;
	
	
	
	
	public void setExamDepartment(ExamDepartment examDepartment) {
		this.examDepartment = examDepartment;
	}
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ExamDepartment getExamDepartment() {
		return examDepartment;
	}


	public JavaTeacher() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Teach() {
		System.out.println("Java Teacher Teachs");
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("----------------------\n");
		
	}

	@Override
	public void takeSubjectExam() {
		examDepartment.takeExam();
		System.out.println("Taking Java Exam");
	}
	
	//init Method() , Destroy()
	void init()
	{
		System.out.println("Java Teacher init() method called");
	}
	void destroy()
	{
		System.out.println("Java Teach destroy() method called");
	}

}
