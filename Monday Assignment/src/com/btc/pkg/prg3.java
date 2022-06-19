package com.btc.pkg;

public class prg3 
{
	public static int[] check(int arr1[],int arr2[]) 
	{
		
		int res[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]!=arr2[j])
				{
					for(int k=0;k<res.length;k++)
					{
						res[k]=arr1[i];
						res[k+1]=arr2[j];
						break;
					}
				}
			}
		}
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
			{
				System.out.print(res[i]+" ");
				
			}
			
		}
		return res;
		
	}
}
