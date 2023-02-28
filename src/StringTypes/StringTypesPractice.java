package StringTypes;

public class StringTypesPractice {

	public static void main(String[] args) {

		// Immutable String
		
//		String s1 = "Nishanth";
//		
//		System.out.println(System.identityHashCode(s1));
//		
//		String s2 = "Nishanth";    // memory is shared, when dupilcate value is stored
//		
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s1+s2); // New memory is created, when we concat
//		
//		System.out.println(System.identityHashCode(s1+s2));
		
		// Mutable String 
		
		// String Buffer And String Builder
		
		// String Buffer
		
		StringBuffer s1 = new StringBuffer("Sivaji");

		System.out.println(System.identityHashCode(s1));
		
		StringBuffer s2 = new StringBuffer("Sivaji"); // new memory is created, when we give duplicate value

		System.out.println(System.identityHashCode(s2));
		
		// append
		
		System.out.println(s1.append(s2));  // memory is shared, when we append
		
//		System.out.println(System.identityHashCode(s1.append(s2)));	
		
		System.out.println(System.identityHashCode(s2.append(s1)));	
	}

}
