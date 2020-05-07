package com.A3DIUsingConstructor;

public class ScienceTeacher implements Teacher{
	
	private ExamDepartment examDepartment;
	

	public ScienceTeacher(ExamDepartment examDepartment) {
		this.examDepartment = examDepartment;
	}

	@Override
	public void Teach() {
		System.out.println("Science Teacher Teaches");
	}
	
	@Override
	public void takeSubjectExam() {
		examDepartment.takeExam();
		System.out.println("Taking Science Exam");
	}
	
}
