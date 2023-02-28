package com.oops;    // package 

public class OopsPractice {    // class 
	
	    public void superBike() {    // method
			
			System.out.println("Yamaha R1");  // printing statement
			
		}
		
		public void superCar() {   // method
			
			System.out.println("BMW");   // printing statement
			
		}

	    public static void main(String[] args) {  // main method
		
		 OopsPractice obj = new OopsPractice();	// object 
		                               
		 obj.superBike();   // method calling using object
		 
		 obj.superCar();   // method calling using object
		 
	    }
	    
}