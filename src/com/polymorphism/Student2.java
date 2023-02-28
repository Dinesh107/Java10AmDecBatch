package com.polymorphism;

public class Student2 extends College {
	
	@Override
	public void studentName(String name) {
		
		super.studentName(name);
		
	}

	@Override
	public void studentDetails(int age, String fn, String dob) {
		
		super.studentDetails(age, fn, dob);
		
	}

	@Override
	public void studentMark(int tm, int twm) {
		
		super.studentMark(tm, twm);
		
	}
	
	public static void main(String[] args) {
		
		Student2 obj = new Student2();
		
		obj.studentName("Karthik");
		
		obj.studentDetails(20, "venkat", "12-09-2000");
		
		obj.studentMark(410, 1109);
		
	}

}
