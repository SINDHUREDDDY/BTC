package com.btc.pkg;

import java.util.Arrays;

public class prg9 {

	public static void sort(int size,String[] list,int index) 
	{
		System.out.println("Before Sorted ");
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]+"\t");
		}
		     
		for(int i = 0; i<size-1; i++)   
		{  
		for (int j = i+1; j<list.length; j++)   
		{  
		//compares each elements of the array to all the remaining elements  
		if(list[i].compareTo(list[j])>0)   
		{  
		//swapping array elements  
		String temp = list[i];  
		list[i] = list[j];  
		list[j] = temp;  
		}  
		}  
		}  
		//prints the sorted array in ascending order  
		System.out.print("\nAfter Sorting\n"+Arrays.toString(list));  
		reverse(list,index);

	}
	public static void reverse(String[] str, int index)
	   {
	      for(int a = 0; a < str.length / 2; a++)
	      {
	         String strTemp = str[a];
	         str[a] = str[str.length - a - 1];
	         str[str.length - a - 1] = strTemp;
	      }
	      System.out.println("\nReversed string array: ");
	      for(int a = 0; a < str.length; a++)
	      {
	         System.out.print(str[a]+"\t");
	         
	      }
	      if(index==1)
	      {
    		  System.out.println("\nEntered index is 1 so printing 0th index of reversed array:\n"+str[0]);
	      }
	   }

}
