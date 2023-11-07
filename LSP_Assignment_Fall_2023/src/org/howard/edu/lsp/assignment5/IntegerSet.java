package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/**
 * 
 * @author Aniya Wilson
 * 
 */
public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Adds an integer to IntegerSet or does nothing if it is already there
	 * @param item the integer to be added to IntegerSet
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * Clears internal representation of set
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Returns size of the set
	 * @return length of set
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Checks if this set contains specific integer value
	 * @param value element to be searched for in set
	 * @return true if found in set, false otherwise
	 */
	public boolean contains(int value) {
		if (set.contains(value)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns the largest item in the set; throws an IntegerSetException if the set is empty
	 * @return largest item in set, throws an IntegerSetException if the set is empty 
	 * @throws IntegerSetException 
	 */
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Cannot find largest element in empty set.");
		}
		return Collections.max(set);
	}
	
	/**
	 * Returns the smallest item in the set; throws an IntegerSetException if the set is empty
	 * @return smallest item in set, throws an IntegerSetException if the set is empty 
	 */
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Cannot find smallest element in empty set.");
		}
		return Collections.min(set);
	}
	
	
	/**
	 * Removes first occurrence of specified integer value from set
	 * @param item integer value to be removed
	 */
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	}
	
	/**
	 * Creates set union of this set with intSetB so values of both sets will be combined into one
	 * @param intSetB the set to be unionized with this set
	 */
	public void union(IntegerSet intSetB) {		
		Iterator<Integer> iter = intSetB.iterator();
		Integer temp;
		while (iter.hasNext()) {
			temp = iter.next();
			this.add(temp);
		}
	}

	/**
	 * Creates a set intersection of this set with intSetB so only values present in both sets will remain
	 * @param intSetB the set to be intersected with this set
	 */
	public void intersect(IntegerSet intSetB) {
		List<Integer> intersection = new ArrayList<Integer>();
		Iterator<Integer> iter = this.iterator();
		Integer temp;
		while (iter.hasNext()) {
			temp = iter.next();
			if (intSetB.contains(temp)) {
				intersection.add(temp);
			}
		}
		set = intersection;
	} 

	/**
	 * Creates set difference containing the values in this set that are not present in intSetB
	 * @param intSetB the set to be compared to this set
	 */
	public void diff(IntegerSet intSetB) {
		List<Integer> difference = new ArrayList<Integer>();
		Iterator<Integer> iter = this.iterator();
		Integer temp;
		while (iter.hasNext()) {
			temp = iter.next();
			if (!intSetB.contains(temp)) {
				difference.add(temp);
			}
		}
		set = difference;
	}

	/**
	 * Creates set complement containing the values in intSetB that are not present in this set
	 * @param intSetB the set to be compared to this set
	 */
	public void complement(IntegerSet intSetB) {
		List<Integer> comp = new ArrayList<Integer>();
		Iterator<Integer> iter = intSetB.iterator();
		Integer temp;
		while (iter.hasNext()) {
			temp = iter.next();
			if (!this.contains(temp)) {
				comp.add(temp);
			}
		}
		set = comp;
	}
	
	/** 
	 * Helper function for set operations. Allows this set to be iterable
	 * @return an iterator over the elements in this set in proper sequence
	 */
	public Iterator<Integer> iterator() {
		return set.iterator();
	}
	
	/**
	 * Checks if this set is empty
	 * @return true if empty, false is not
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
	 * Returns set as a string
	 */
	public String toString() {
		return set.toString();
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        return set.containsAll(that.set) && that.set.containsAll(set);
	}
	
}