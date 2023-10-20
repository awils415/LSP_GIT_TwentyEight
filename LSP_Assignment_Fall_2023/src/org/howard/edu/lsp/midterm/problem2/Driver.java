package org.howard.edu.lsp.midterm.problem2;


/** 
 * @author Aniya Wilson
 */
public class Driver {
	public static void main(String[] args) {
        Range range1 = new Range(5, 10);
        Range range2 = new Range(8, 15);
        Range range3 = new Range(1, 7);
        Range range4 = new Range(100, 700);
        int testValue = 7;
        System.out.println("Is " + testValue + " in range? "  + 
        range1.isValueInRange(testValue));
        System.out.println("Do range 1 and range 2 overlap? " + 
        range1.doRangesOverlap(range2));
        System.out.println("Do range 1 and range 3 overlap? " + 
        range1.doRangesOverlap(range3));
        System.out.println("Do range 1 and range 4 overlap? " + 
        range1.doRangesOverlap(range4));
        System.out.println("Size of range 1: " + range1.size());
	}
}
