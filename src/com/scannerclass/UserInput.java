package com.scannerclass;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		// Scanner Class 
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter Your Gender:- ");
		
		String gender = sc.next();
		
		System.out.println("Your gender is " + gender);
		
		sc.nextLine();
		
		// 1) nextLine
		
		System.out.println("Enter Your Name:- ");
		
		String name = sc.nextLine();
		
		System.out.println("your name is " + name);
		
		//2) nextInt
		
		System.out.println("Enter Your age:- ");
		
		int age = sc.nextInt();
		
		System.out.println("Your age is " + age);
		
		//3) nextFloat
		
		System.out.println("Enter Your height:- ");
		
		float height = sc.nextFloat();	
		
		System.out.println("your height is:- " + height);
		
		System.out.println("Enter Your Initial");
		
		char initial = sc.next().charAt(0);
		
		System.out.println("Your Initial Is :- " + initial);
		
		
		
//        System.out.println("Enter a number 1:- ");
//		
//		int no1 = sc.nextInt();
//		
//        System.out.println("Enter a number 2:- ");
//		
//		int no2 = sc.nextInt();
//		
//		int ans = no1 + no2;
//		
//		System.out.println("the addition of two numbers is:- " + ans);
		
	}

}
