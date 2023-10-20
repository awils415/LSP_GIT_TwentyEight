package org.howard.edu.lsp.midterm.problem2;


/**
 * @author Aniya Wilson
 */
public class Range {
	private int start;
	private int end;
	
	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public boolean isValueInRange(int value) {
		if (start <= value && value <= value) {
			return true;
		}
		return false;
	}
	
	public boolean doRangesOverlap(Range otherRange) {
		if (this.start <= otherRange.end && this.end >= otherRange.start) {
			return true;
		}
		return false;
	}
	
	public int size() {   //including last element
		return (this.end - this.start) + 1;
	}
	

}
