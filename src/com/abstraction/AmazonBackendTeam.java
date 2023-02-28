package com.abstraction;

public class AmazonBackendTeam extends AmazonDemoUser1 {

	@Override
	public void demoUserPassword() {

		System.out.println("user1234");
		
	}
 
	public static void main(String[] args) {
		
		AmazonBackendTeam obj = new AmazonBackendTeam();
		
		obj.demoUserName();
		
		obj.demoUserPassword();
	}

}
