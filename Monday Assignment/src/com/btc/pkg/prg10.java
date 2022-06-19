package com.btc.pkg;

public class prg10 {

	public static int test(int arr1[],int arr2[]) 
	{
		
		int sum=0;
		int count=0;
		int logic[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(count<arr1.length)
					{
						logic[count]=arr1[i];
						count++;
					}
				}
			}
		}
		for(int i=0;i<logic.length;i++)
		{
			if(logic[i]!=0)
			{
				sum=sum+logic[i];
				
			}
			
		}
		return sum;

	}

}
