package com.capgemini.day2;

public class Duplicate {

	public static String findDuplicate(String string) {
		
		char ch;
		String ans="";
		for(int start=0;start<string.length();start++)
		{
			ch=string.charAt(start);
			if(ch!=' ')
			
				ans=ans+ch;
				string=string.replace(ch,' ');
				return ans;
		}
		return ans;
	}

}
