package com.capgemini.day2;

public class LinearSearch {

	public static boolean searchItem(int number) {
		int i;
		int length;
		int arr[]= {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		length=arr.length;
		for(i=0;i<length;i++) {
			if(arr[i]==number)
			{
				return true;
			}
	}
		return false;
	}
}