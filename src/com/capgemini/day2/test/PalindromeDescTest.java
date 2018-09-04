package com.capgemini.day2.test;

import static org.junit.Assert.assertArrayEquals;


import org.junit.jupiter.api.Test;

import com.capgemini.day2.PalindromeDesc;

class PalindromeDescTest {
	String words[] = { "lolololol", "lolol", "asf", "awsed", "lol", "ffgf", "s", "asdf", "asdfg", "asw" };

	@Test
	void test() {
		assertArrayEquals(new String[] { "lolololol", "lolol", "lol", "s" }, PalindromeDesc.sorting(words));
	}

}