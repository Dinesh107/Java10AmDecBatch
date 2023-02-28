package com.keywords;

public class Parent {
	
	int a = 12;       // class variable
	
	static int b = 10;  // static variable
	
	/*final*/ public void method1() {     // java method

		System.out.println("Parent Method1");
		
	}
	
	public static void method2() {      // static method

		System.out.println("Parent Method2");
		
	}
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		
		obj.method1();
		
		System.out.println(obj.a);
		
		System.out.println("------------------------------------------");
		
		System.out.println(b);
		
		method2();
		
		System.out.println("-------------------------------------------");
		
		System.out.println("--Final keyword in Variable level--");
		
		/*final*/ int c = 100;
		
		System.out.println(c);
		
		int e = 101;
		
		c = e;
		
		System.out.println(c);
		
		
		
	}

}
