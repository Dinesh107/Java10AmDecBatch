package com.abstraction;

public class Daughter implements Father , Mother {

	@Override
	public void bike() {

		System.out.println("jupiter");
		
	}

	@Override
	public void watch() {

		System.out.println("titan");
		
	}

	@Override
	public void car() {

		System.out.println("alto 800");
		
	}

	@Override
	public void land() {

		System.out.println("2 acre");
		
	}

	public static void main(String[] args) {
		
		Daughter obj = new Daughter();
		
		obj.bike();
		
		obj.car();
		
		obj.land();
		
		obj.watch();
	}
	
}
