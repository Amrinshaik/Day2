package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.LinearSearch;

class LinearSearchTest {

	@Test
	void test() {
		assertEquals(true, LinearSearch.searchItem(7));
		assertEquals(false, LinearSearch.searchItem('f'));
		assertEquals(false, LinearSearch.searchItem(-6));
	}

}
