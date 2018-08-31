package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.BubbleSort;

class BubbleSortTest {

	@Test
	void test() {
		assertArrayEquals(new int[] {1,5,6,7,12,14,19,23,26,35,37,47,52,78,86},BubbleSort.Sort(new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}));
	}

}
