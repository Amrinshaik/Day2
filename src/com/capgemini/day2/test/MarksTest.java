package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Marks;

class MarksTest {

		@Test
		void testCheckMarks() {
			assertEquals("passed", Marks.checkMarks(68,66,76));
		}
		@Test
		void testCheckMarks1() {
			assertEquals("promoted", Marks.checkMarks1(66,75,50));
		}
		@Test
		void testCheckMarks2() {
			assertEquals("failed", Marks.checkMarks2(42,35,44));
		}
	}

