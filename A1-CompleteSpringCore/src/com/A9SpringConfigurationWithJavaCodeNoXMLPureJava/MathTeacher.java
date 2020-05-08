package com.A9SpringConfigurationWithJavaCodeNoXMLPureJava;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	//literal values
	//@Value("18")
	@Value("${teacher.age}")
	private int age;
	//@Value("John")
	@Value("${teacher.name}") // to inject values from properties file
	private String name ;
	//objective types
	@Autowired
	private ExamDepartment examDepartment;
	
	
	
	

	public void setExameDepartment(ExamDepartment exameDepartment) {
		this.examDepartment = exameDepartment;
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


	public void setExamDepartment(ExamDepartment examDepartment) {
		this.examDepartment = examDepartment;
	}


	public MathTeacher() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Teach() {
		System.out.println("Math Teacher Teaches");
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("----------------------\n");
		
	}
	
	@Override
	public void takeSubjectExam() {
		examDepartment.takeExam();
		System.out.println("Taking Math Exam");
		
	}
	
	//init Method() , Destroy()
	@PostConstruct
	void init()
	{
		System.out.println("Math Teacher init() method called");
	}
	@PreDestroy
	void destroy()
	{
		System.out.println("Math Teach destroy() method called");
	}
	
}
