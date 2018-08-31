package com.capgemini.day2;

public class Reverse {

	public static String reversestring(String string) {
		
        String reverse="";
		
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		return reverse;
	}

}
