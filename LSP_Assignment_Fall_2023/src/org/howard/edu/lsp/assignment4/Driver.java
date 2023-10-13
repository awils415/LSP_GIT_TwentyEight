package org.howard.edu.lsp.assignment4;

public class Driver {
	
	public static void main(String[] args) {
		
		// Creating new set
		IntegerSet testSetA = new IntegerSet();
		
		// Adding 1, 2, 3 to set
		System.out.println("Adding 1 to testSetA... ");
		testSetA.add(1);
		System.out.println("Result: " + testSetA.toString() + "\n");
		System.out.println("Adding 2 to testSetA... ");
		testSetA.add(2);
		System.out.println("Result: " + testSetA.toString() + "\n");
		System.out.println("Adding 2 to testSetA... ");		
		testSetA.add(2);
		System.out.println("Result: " + testSetA.toString() + "\n");
		System.out.println("Adding 3 to testSetA... ");		
		testSetA.add(3);
		System.out.println("Result: " + testSetA.toString() + "\n");
		
		// Returning largest value in set
		System.out.println("Largest element in testSetA... " + testSetA.largest());
		
		
		// Create another set
		IntegerSet testSetB = new IntegerSet();
		
		// Adding 4, 5, 3 to set
		System.out.println("Adding 4 to testSetB..." + testSetB.toString());
		testSetB.add(4);
		System.out.println("Result: " + testSetB.toString() + "\n");

		System.out.println("Adding 5 to testSetB... " + testSetB.toString());
		testSetB.add(5);
		System.out.println("Result: " + testSetB.toString() + "\n");
		
		System.out.println("Adding 3 to testSetB... " + testSetB.toString());
		testSetB.add(3);
		System.out.println("Result: " + testSetB.toString() + "\n");
		
		// Union of sets [1, 2, 3] and [4, 5, 3]
		System.out.println("Union of testSetA " + testSetA.toString() + " and testSetB " + testSetB.toString() + "...");
		testSetA.union(testSetB);
		System.out.println("Result: " + testSetA.toString() + "\n"); // [1, 2, 3, 4, 5]
		
		// Return smallest element of set A
		System.out.println("Smallest element in testSetA... " + testSetA.smallest());
		
		// Intersection of sets [1, 2, 3, 4, 5] and [4, 5, 3]
		System.out.println("Intersection of testSetA " + testSetA.toString() + " and testSetB " + testSetB.toString() + "...");
		testSetA.intersect(testSetB);
		System.out.println("Result: " + testSetA.toString() + "\n"); // [3, 4, 5]
		
		// Adding 7 to set B
		System.out.println("Adding 7 to testSetB... ");		
		testSetB.add(7);
		System.out.println("Result: " + testSetB.toString() + "\n");
		
		// Complement of sets [3, 4, 5] and [4, 5, 3, 7]
		System.out.println("Complement of testSetA " + testSetA.toString() + " and testSetB " + testSetB.toString() + "...");
		testSetA.complement(testSetB);
		System.out.println("Result: " + testSetA.toString() + "\n"); // [7]
		
		// Adding 8, 9, 10 to set
		System.out.println("Adding 8, 9, 10 to testSetA... ");
		testSetA.add(8);
		testSetA.add(9);	
		testSetA.add(10);
		System.out.println("Result: " + testSetA.toString() + "\n");		
		
		// Removing 9 from set
		System.out.println("Removing 9 from testSetA... ");
		testSetA.remove(9);
		System.out.println("Result: " + testSetA.toString() + "\n");
		
		System.out.println("Length of testSetA..." + testSetA.length() + "\n");
		
		testSetA.clear();
		System.out.println("Result: " + testSetA.toString() + "\n");
		
		System.out.println("Is testSetA empty? \n" + testSetA.isEmpty() + "\n");
		
		// Demonstrating error handling
		testSetA.largest();
		
	}
}
