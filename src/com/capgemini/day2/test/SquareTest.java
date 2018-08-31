package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.capgemini.day2.Square;

class SquareTest {

	@Test
	void testFindSquare() {
		assertEquals(true, Square.findSquare(4));
		assertEquals(true, Square.findSquare('r'));
		assertEquals(true, Square.findSquare(-4));
	}

}
