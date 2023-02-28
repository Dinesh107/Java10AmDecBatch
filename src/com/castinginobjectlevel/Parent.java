package com.castinginobjectlevel;

public class Parent {
	
	public void parentMethod1() {

		System.out.println("Parent method 1");
		
	}
	
	public void parentMethod2() {

		System.out.println("Parent method 2");
		
	}
	
	public static void main(String[] args) {
//     class refrence class object		
		Parent obj = new Parent();
		
		obj.parentMethod1();
		
		obj.parentMethod2();
		
	}

}
