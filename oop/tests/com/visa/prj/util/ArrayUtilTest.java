package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data = {5,6,4};
		assertEquals(15, ArrayUtil.getSum(data));
		
		int[] elems = {-1,0,1};
		assertEquals(0, ArrayUtil.getSum(elems));
	}

	@Test
	public void testGetCount() {
		int[] elems = {57,23,16,13,19,16};
		assertEquals(2, ArrayUtil.getCount(elems,16));
	}

	@Test
	public void testSort() {
		int[] elems = {9,7,5,3,1};
		ArrayUtil.sort(elems);
		int[] expected = {1,3,5,7,9};
		assertArrayEquals(expected,elems);
	}

}
