package com.A4DIUsingSetter;

public class ScienceTeacher implements Teacher{
	
	//literal values
	private int age;
	private String name ;
	//objective types
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

	public ScienceTeacher() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Teach() {
		System.out.println("Science Teacher Teaches");
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("----------------------\n");
	}
	
	@Override
	public void takeSubjectExam() {
		examDepartment.takeExam();
		System.out.println("Taking Science Exam");
	}
	
}
