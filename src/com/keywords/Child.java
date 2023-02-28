package com.keywords;

public class Child extends Parent  {
	
	  int a = 90;
      
      public void method3() {

    	  System.out.println(super.a);  // parent class refrence
    	  
    	  System.out.println(this.a);   // current class refrence
    	  
	  }

	public static void main(String[] args) {
	
		Child obj = new Child();
		
		obj.method3();
		
	}

}
