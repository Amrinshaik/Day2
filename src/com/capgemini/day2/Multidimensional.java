package com.capgemini.day2;

public class Multidimensional {

	public static String searchElement(int[][] num) {
		int valueToBeSearched=2;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
			{
				if(valueToBeSearched==num[i][j])
				{
					return "Found";
				}
			}
		}
		return null;
	}

}
