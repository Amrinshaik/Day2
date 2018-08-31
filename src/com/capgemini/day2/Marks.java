package com.capgemini.day2;

public class Marks {

	public static String checkMarks(int i, int j, int k) {
		if(i>60 && j>60 && k>60)
		{
			return "passed" ;

		}
		return null;
	}

	public static String checkMarks1(int i, int j, int k) {
		if((i>60 && j>60) || (i>60 && k>60) || (j>60 && k>60))
		{
			return "promoted";
		}
		return null;
	}

	public static String checkMarks2(int i, int j, int k) {

		if(i<60 && j<60 &&k<60)
		{
			return "failed";
		}
		return null;
	}
}
