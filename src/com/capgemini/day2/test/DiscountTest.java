package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.capgemini.day2.Discount;

class DiscountTest {

	@Test
	void testcheckNewItem() {
		assertEquals(450, Discount.calculateDiscount(500,10));
	}

}