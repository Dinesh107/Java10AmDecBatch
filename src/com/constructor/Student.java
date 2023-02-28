package com.constructor;

public class Student {
	
	public Student() {  //Non Parameterized Constructor or default constructor

	    System.out.println("default constructor");
	
	}
	
    public Student(String name) { // Parameterized Constructor
    	
    	System.out.println(name);
    	
    }
    
    public Student(int m1, int m2) { // Parameterized Constructor
    	
    	System.out.println(m1 + " " + m2);
    	
    }
    
    public void method1() {  // method

    	System.out.println("method 1");
    	
	}
    
    public static void main(String[] args) {
    	
    	Student obj2 = new Student("siva");
    	  	
    	Student obj1 = new Student();
		
    	Student obj3 = new Student(23, 45);
  	
     
	}
}
