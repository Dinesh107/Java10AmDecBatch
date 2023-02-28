package com.array;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		
		// Array 
		
//		int a[] = new int[5];
//		
//		a[0] = 30;
//		
//		a[1] = 50;
//		
//		a[2] = 70;
//		
//		a[3] = 90;
//		
//		a[4] = 110;
		
//		int a[] = {23,33,43,53,63,73,83};
//	
//		
//		                   
//		for(int i = 0; i < a.length; i++) {  
//			
//			System.out.println(a[i]);
//			
//		}
		
		// for each loop or iteration loop
		
//		for(int s : a) {
//			
//			System.out.println(s);
//			
//		}
		
		// adding all the elememts in the array
		
		int a[] = {23,33,43,53};
		
		int result = 0;
		
	//                        4	
		for(int i = 0; i < a.length; i++) {  // i = 0, res = 23, i = 1, res = 56, i = 2, res = 99, i = 3, res = 152, i = 4  
			
		    result = result + a[i];
			
		}
		
		System.out.println("The addition of all elements in the array is:- " + result);
	}

}
