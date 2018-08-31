package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.DeleteWord;

class DeleteWordTest {

	@Test
	void test() {
		assertEquals("welcome to capgemini ",DeleteWord.removeDuplicates("welcome to capgemini capgemini"));
	}

}
