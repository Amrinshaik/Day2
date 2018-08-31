package com.capgemini.day2;

public class BubbleSort {

	public static int[] Sort(int[] array) {
	
		int temp;
	    for(int i=0;i<=14;i++)
	    {
	    
		     for(int j=i+1;j<=14;j++)
		     {
			          if(array[i]>array[j])
			          {
				            temp = array[i];
				           array[i] = array[j];
				           array[j] = temp;
			           }
		      }
	    }
	    return array;
}
}

