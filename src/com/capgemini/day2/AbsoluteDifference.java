package com.capgemini.day2;

public class AbsoluteDifference {

	public static int findAbsoluteDifference(int size, int[] arr, int k) {
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(Math.abs(i-j) <= k)
				{
					if(arr[i]==arr[j])
					{
						return 1;
					}
				}
			}
		}
		return 0;
	}

}
