package com.exception;

public class ThrowAndThrows {

	
	public static void validation(int age) throws Exception {

		if(age>=18) {
			
			throw new Exception("400 — Bad Request.");
			
		} else {
			
			System.out.println("You cannot vote");
			
		}
		
	}
	
	public static void main(String[] args) throws Exception {

		validation(20);
		
	}

}
