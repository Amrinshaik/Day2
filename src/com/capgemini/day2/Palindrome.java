package com.capgemini.day2;

public class Palindrome {

	public static boolean findPalindromeNumber(int number) {
		
		int originalNumber = number;
		int rem=0;
		int sum=0;
		while(originalNumber>0) {
			rem=originalNumber%10;
			sum=(sum*10)+rem;
			originalNumber=originalNumber/10;
		}
		if(number==sum)
		return true;
		else
		return false;

	}

	
}