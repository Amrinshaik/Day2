package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.capgemini.day2.Interest;

class InterestTest {

	@Test
	void testSimpleInterestCalculation() {
		assertEquals(2000,Interest.simpleInterestCalculation(25000,2,4));
	}
	
	@Test
	void testCompoundInterestCalculation() {
		assertEquals(25754.974, Interest.compoundInterestCalculation(250000,2.5,4.0),0.02);
	}
	

}
