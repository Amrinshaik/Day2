package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.AbsoluteDifference;

class AbsoluteDifferenceTest {

	@Test
	void test() {
		assertEquals(1,AbsoluteDifference.findAbsoluteDifference(8,new int[] {1,2,3,4,5,4,3,2},5));
	}

}
