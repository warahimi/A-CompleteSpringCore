package com.A3DIUsingConstructor;

public class MathTeacher implements Teacher{

	private ExamDepartment exameDepartment;
	
	
	
	//Constructor
	public MathTeacher(ExamDepartment exameDepartment) {
		this.exameDepartment = exameDepartment;
	}

	@Override
	public void Teach() {
		System.out.println("Math Teacher Teaches");
		
	}
	
	@Override
	public void takeSubjectExam() {
		exameDepartment.takeExam();
		System.out.println("Taking Math Exam");
		
	}
	
}
