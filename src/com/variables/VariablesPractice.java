package com.variables;

public class VariablesPractice {
	
	int b = 12;   // --> class variable, it will be in blue colour
	
    static int c = 80;   // static varaible
	
	 public void method1() {

		 int a = 10;       // ----> local variable, it will be in brown colour
		 
		 System.out.println(a);
		 
		 System.out.println(c);
		 
	 }
	 
	public static void main(String[] args) {
		
		VariablesPractice obj = new VariablesPractice();
		
		obj.method1();
		
		System.out.println(obj.b);
		
		System.out.println("static variable:- "+ c);

	}

}
