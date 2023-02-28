package com.polymorphism;

public class Student {
	

	public void studentDetails(String name) {  // datatype 

		System.out.println(name);
		
	}

	
	public void studentDetails(byte age, byte height, char initial) {  // datatype order
		
		System.out.println(age + " " + height + " " + initial);
	
		
	}

	 
     public void studentDetails(int m1, int m2, int m3) {   // datatype count
		
    	 System.out.println(m1 + " " + m2 + " " + m3);
		
	}
     
     
//     public int add(int i, int j) {
//    	 
//    	return i + j; 
// 		
// 	}
//     
//     public int add(int i, int j, int k) {
//    	 
//    	 return i + j + k;
// 		
// 	}
//     
//     public int add(int i, int j, int k, int l) {
//    	 
//    	 return i + j + k + l;
// 		
// 	}
     
    public static void main(String[] args) {
		
    	Student obj = new Student();
    	
//    	System.out.println("The Addition of two number is :- " + obj.add(20, 20));
//    	
//    	System.out.println("The Addition of three number is :- " + obj.add(40, 20, 50));
//    
//    	System.out.println("The Addition of four number is :- " + obj.add(10, 10, 10, 30));
    	
        obj.studentDetails("Ram");
    	
    	obj.studentDetails(20, 5, 'S');
    	 
    	obj.studentDetails(90, 97, 100);
	}
}
