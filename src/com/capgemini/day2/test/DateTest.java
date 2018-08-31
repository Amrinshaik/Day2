package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;

class DateTest {

	@Test
	void test() {
		assertEquals("8/January/2018",Date.checkDate(8,1,2018));
	}

}
