package com.gradecal.calculator;


public class GradeCal {

	public String grade(int marks) {
		
		String grade;
		if(marks>=90 && marks<=100) {
			grade = "A";
		}else if(marks>=80 && marks<=89) {
			grade = "B";
		}else if(marks>=70 && marks<=79) {
			grade = "C";
		}else if(marks>=60 && marks<=69) {
			grade = "D";
		}else if(marks>=50 && marks<=59) {
			grade = "E";
		}else {
			grade = "W";
		}
		
		return grade;
	}
}
