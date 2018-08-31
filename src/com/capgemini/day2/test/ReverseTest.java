package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Reverse;

class ReverseTest {

	@Test
	void test() {
		assertEquals("fish",Reverse.reversestring("hsif"));
	}

}
