package com.controlstatement;

public class ControlStatementPractice {

	public static void main(String[] args) {
		
		// for loop
		
//		int i;

//           1	    2      4
//		for(i = 1; i<=5; i = i + 1) {  // i = 1, i = 2, i = 3, i = , i = , i = 
//			
//			// 3
//			
//			System.out.println("a");
//		
//		}
//		
//        for(i = 1; i<=5; i++) {  // i = 1, i = 2, i = 3, i = , i = , i = 
//			
//			// 3
//			
//			System.out.print("b" + " ");
//		
//		}
		
		// while loop  ---> Entry Control Loop
		
//		int i = 1;  // 1
//		
//		while(i<=4) {   // 2 
//			
//			System.out.println(i);  // 3
//			
//			i++;       // 4
//		}
		
		// do while Loop   ----> exit control loop
		
//		int i = 1;  // 1 
//		
//		do {
//			
//			System.out.print(i);   // 2 
//			
//			i++;       // 3
//		
//		} while(i<=4);  // 4
//		
//		System.out.println("---------------------");
//		
//		System.out.println(i + " " + "is there in i after, the loop completion");
		
		// nested for loop
		
		
	  //        1	     2     7 
//		for(int i = 1; i<=3; i++) {     // outer loop is responsible for printing rows, i = 1, i = , i = , i = 3 , i = 4
//			
//		          	          
//			for(int j = 1; j<=i; j++) {  // inner loop is responsible for printing column or values j = 1, j =  , j = 3,  j = 4, j = 
//				 
//				
//				System.out.print("*" + " ");
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		// for triangle
		
		int i,j;
		
		int row = 3;
	//             	    3
		for(i = 0; i < row; i = i + 1) {  // i = 0, i = 1, i = 2, i = 3          outer loop
			
			//       3 - 2    
			for(j = row-i;   j>1;   j = j - 1) {  // j = 1, j = , j = , j =     for printing the space
				
				System.out.print(" ");
				
			}
			//              2
			for(j = 0; j <= i; j = j + 1) {  // j = 0, j = 1, j =  2, j =3      for printing the values
				
				System.out.print("* ");
				
			}
		
			System.out.println();      // new line
			
			
		}
		
		System.out.println("loop ended");
		
	}
	
}