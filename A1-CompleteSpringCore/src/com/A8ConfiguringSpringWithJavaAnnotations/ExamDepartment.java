package com.A8ConfiguringSpringWithJavaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class ExamDepartment implements Exam{

	@Override
	public void takeExam() {
		System.out.println("We are exam Department. We take exames...");
	}

}
