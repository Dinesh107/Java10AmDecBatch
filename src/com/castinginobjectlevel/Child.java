package com.castinginobjectlevel;

public class Child extends Parent {
	
	public void childMethod1() {

		System.out.println("Child method 1");
		
	}

	public void childMethod2() {

		System.out.println("Child method 2");
		
	}
	
	public static void main(String[] args) {
		
//	     class refrence  class object		
		
			//Child obj = new Child();
			
			
			// downcasting ---> this downcasting is not possible in java
			
			// Child obj = new Parent();
			
			// upcasting 
			
			Parent obj = new Child();
		    
		    obj.parentMethod1();
		    
		    obj.parentMethod2();
			
		}

}
