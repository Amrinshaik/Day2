package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Duplicate;

class DuplicateTest {

	@Test
	void test() {
		assertEquals("r",Duplicate.findDuplicate("rprprp"));
	}

}
