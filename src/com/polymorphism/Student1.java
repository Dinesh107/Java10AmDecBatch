package com.polymorphism;

public class Student1 extends College {

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
		
    	Student1 obj = new Student1();
    	
    	obj.studentName("Ram");
    	
    	obj.studentDetails(20, "Siva", "09-03-2000");
    	
    	obj.studentMark(490, 1190);
    	
	}
	

}
