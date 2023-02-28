package com.castingindatatypes;

public class CastingInDatatypes {

	public static void main(String[] args) {
		
		// narrowing typecasting
		
		System.out.println("Narrowing typecasting");
		
		byte a = 100;
		
		System.out.println(a);
		
		short b = a;
		
		System.out.println(b);
		
		System.out.println("----------------------------------------");
		
		System.out.println("widenning typecasting");
		
		// widenning typecasting
		
		short i = 23;
		
		System.out.println(i);
		
		byte j = (byte) i;
		
		System.out.println(j);
		
		System.out.println("-------------------------------");
		
        float k = 3.4f;
		
        System.out.println(k);
		
		int r = (int) k;
		
	    System.out.println(r);
	    
	    System.out.println("-------------------------------");
	    
	    double x = 2.3445445444;
	    
	    float y = (float) x;
	    
	    System.out.println(y);
		
		
	}

}
