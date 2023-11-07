package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * @author Aniya Wilson
 */

public class IntegerSetTest {
	
	private IntegerSet setA;
	private IntegerSet setB;
	private IntegerSet nullSet;

	@BeforeEach
	public void setUp() throws IntegerSetException {
		setA = new IntegerSet();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		setB = new IntegerSet();
		setB.add(4);
		setB.add(5);
		setB.add(6);
		
		nullSet = new IntegerSet();
		
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		nullSet.add(0);
		assertTrue(nullSet.contains(0));
		assertFalse(nullSet.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		setA.clear();
		assertTrue(setA.isEmpty());
	}

	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertEquals(setA.length(), 3);
		assertEquals(nullSet.length(), 0);
	}
	
	@Test
	@DisplayName("Test for contains")
	public void testContains() {
		assertTrue(setA.contains(1));
		assertFalse(setA.contains(0));
	}
	
	@Test
	@DisplayName("Test for largest")
	public void testEmptyLargest() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> nullSet.largest());
		assertNotNull(exception.getMessage());
		assertEquals("Cannot find largest element in empty set.", exception.getMessage());
		assertEquals(setA.largest(), 3);
	}
	
	@Test
	@DisplayName("Test for smallest")
	public void testSmallest() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> nullSet.smallest());
		assertNotNull(exception.getMessage());
		assertEquals("Cannot find smallest element in empty set.", exception.getMessage());
		assertEquals(setA.smallest(), 1);
	}
	
	@Test
	@DisplayName("Test for remove")
	public void testRemove() {
		setA.remove(1);
		assertFalse(setA.contains(1));
	}
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		IntegerSet equalSetA = new IntegerSet();
		equalSetA.add(1);
		equalSetA.add(2);
		equalSetA.add(3);
				
		assertEquals(setA, equalSetA);
		assertNotEquals(setA, setB);
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		setA.union(setB);
		assertEquals(setA.toString(), "[1, 2, 3, 4, 5, 6]");
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		setA.intersect(setB);
		nullSet.add(5);
		setB.intersect(nullSet);
		assertEquals(setA.toString(), "[]");
		assertEquals(setB.toString(), "[5]");
	}
	
	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		setA.diff(setB);
		nullSet.add(4);
		nullSet.add(6);
		setB.diff(nullSet);
		assertEquals(setA.toString(), "[1, 2, 3]");
		assertEquals(setB.toString(), "[5]");
	}
	
	@Test
	@DisplayName("Test case for complement")
	public void testComplement() {
		setA.complement(setB);
		assertEquals(setA.toString(), "[4, 5, 6]");
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		assertTrue(nullSet.isEmpty());
		assertFalse(setA.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		assertEquals(setA.toString(), "[1, 2, 3]");
		assertEquals(nullSet.toString(), "[]");
	}

}
