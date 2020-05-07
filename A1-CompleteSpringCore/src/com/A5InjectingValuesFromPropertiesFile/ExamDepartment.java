package com.A5InjectingValuesFromPropertiesFile;

public class ExamDepartment implements Exam{

	@Override
	public void takeExam() {
		System.out.println("We are exam Department. We take exames...");
	}

}
