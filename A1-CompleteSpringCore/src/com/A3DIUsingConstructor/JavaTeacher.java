package com.A3DIUsingConstructor;

public class JavaTeacher implements Teacher {

	private ExamDepartment examDepartment;
	
	
	
	public JavaTeacher(ExamDepartment examDepartment) {
		this.examDepartment = examDepartment;
	}

	@Override
	public void Teach() {
		System.out.println("Java Teacher Teachs");
		
	}

	@Override
	public void takeSubjectExam() {
		examDepartment.takeExam();
		System.out.println("Taking Java Exam");
	}

}
