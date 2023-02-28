package com.exception;

public class TryAndCatch {

	public static void main(String[] args) {

		try {
			
			String s = null;
			
			int le = s.length();
			
			System.out.println(le);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			System.out.println("In this try catch we have null pointer exception");
			
		}
		
		System.out.println("Remaining Code");
		
		int c = 10;
		
		int d = 10;
		
		System.out.println(c + d);
	}

}
