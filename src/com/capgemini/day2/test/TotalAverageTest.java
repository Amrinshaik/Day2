package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.TotalAverage;

class TotalAverageTest {

	@Test
		void testTotAndAvgOfStudents() 
		{
			assertEquals(140,TotalAverage.checkTotalOfStudent1(30,45,65));
			assertEquals(170,TotalAverage.checkTotalOfStudent2(60,45,65));
			assertEquals(190,TotalAverage.checkTotalOfStudent3(50,55,85));
			assertEquals(46.00,TotalAverage.checkAverageOfStudent1(30,45,65));
			assertEquals(56.00,TotalAverage.checkAverageOfStudent2(60,45,65));
			assertEquals(63,TotalAverage.checkAverageOfStudent3(50,55,85));
		}
		@Test
		void testTotAndAvgOnSubjects()
		{
			assertEquals(140,TotalAverage.checkTotalOfAllInSubject1(30,60,50));
			assertEquals(165,TotalAverage.checkTotalOfAllInSubject2(45,55,65));
			assertEquals(215,TotalAverage.checkTotalOfAllInSubject3(65,65,85));
			assertEquals(46.00,TotalAverage.checkAverageOfAllInSubject1(30,60,50));
			assertEquals(55.00,TotalAverage.checkAverageOfAllInSubject2(45,55,65));
			assertEquals(71.00,TotalAverage.checkAverageOfAllInSubject3(65,65,85));
		}
}
