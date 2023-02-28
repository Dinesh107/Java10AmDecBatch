package com.problemsolving;

import java.util.Scanner;

public class ProblemSolving {
	
	public static void main(String[] args) {
		
		// 1) Whether the given number is odd or even
		
//		int a = 10;
//		
//		int b = 2;
//		
//		System.out.println(a/b);
//		
//		System.out.println(a%b); // % --> Modulus Operator 
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter the number:- ");
//		
//		int num = s.nextInt();
//		
//	    if(num%2==0) {
//	    	
//	    	System.out.println("This number is even");
//	    	
//	    } else {
//	    	
//	    	System.out.println("This number is odd");
//	    	
//	    }
	    

		// 2) Palindrome 
		
//		malayalam
	//	
//		sivaji
	//	
//		ijavis
	//	
//		mam
	//	
//		mam
		
//		String name = "sivaji";
//		
//		String rev = "";
//		
//		
//		int le = name.length();
//		
//	    
//		for(int i = name.length()-1; i>=0; i--) { // i = 5, i = 4, i = 3, i = 2, i = 1, i = 0, i = -1
//			
//			
//			rev = rev + name.charAt(i); // "" + i, rev = i; i + j, rev = ij; ij + a, rev = ija; ija + v, rev = ijav, ijav + i, rev = ijavi; ijavi + s, rev = ijavis 
//			
//			System.out.println(rev);
//			
//		}
//		
//		
//		if(name.equals(rev)) {
//			
//			System.out.println("It is palindrome");
//			
//		} else {
//			
//			System.out.println("it is not a palindrome");
//			
//		}
		
		
		//3)  Fibonannci series
		
//		int a[] = new int[10]; 
//		
//		a[0] = 0;
//		
//		a[1] = 1;
//		
//		int num = 10;
//		
//		for(int i = 2; i<num; i++) { // i=2, i=3, i=4, i = 5
//			
//		  a[i] = a[i-1] + a[i-2]; // a[1] + a[0] = 1 + 0 = 1, a[2] = 1, a[2] + a[1] = 1 + 1 = 2, a[3] = 2
//			
//		}
//		
//		for(int j : a) {
//			
//			System.out.println(j);
//			
//		}
		
		// a[4] = a[3] + a[2] = 2 + 1 = 3
		
		// a[5] = a[4] + a[3] = 3 + 2 = 5
		
		// 4) whether the given number is Prime number or not?
		
		//the number that is not divisible by any number apart from one and the same number
		//is called prime number
		
		
//		int n, rem, flag = 0, i;
//		
//		
//		n = 6;
//
//		for(i = 2; i<n; i++) {
//			
//		   rem = n % i;
//		   
//		   if(rem==0) {
//			   
//			   flag++;
//			   
//		   }
//			   
//		}
//		
//		System.out.println(flag);
//		
//		if(flag==0) {
//			
//			System.out.println("This number is prime number");
//			
//		} else {
//			
//			System.out.println("This number is not a prime number");
//			
//		}
		
		
		// 5) Searching the element in the array
		
//		int a[] = {3,9,7,8,12,6,15,5,4,10};
		
//		int value = 7;
//		
//		for(int i = 0; i < a.length; i++) {
//			
//			
//			if(a[i] == value) {
//				
//				System.out.println("Element found at: " + i);
//				
//				System.exit(0);
//				
//			}
//			
//		}
		
		//System.out.println("Value Not Found");	
		
		// 6) finding the maximum number in the array
		
//		int a[] = {2,4,3,1};
//		
//		int max = a[0]; // max = 2
//		
//		 //                 4
//		for(int i = 0; i<a.length; i++) { // i = 0, i = 1, i = 2, i = 3, i = 4
//			
//			if(a[i] > max) { // a[0] = 2 > 2, a[1] = 4 > 2, a[2] = 3 > 4, a[3] = 1 > 4
//				
//				max = a[i]; // max = a[1] = 4;
//				
//			}
//			
//		}
//		
//		System.out.println("the maximum number is:- " + max);
	}

}
