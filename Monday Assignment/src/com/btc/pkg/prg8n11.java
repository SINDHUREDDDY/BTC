package com.btc.pkg;

public class prg8n11 {

	public static int[] test(int[] arr1,int []arr2) 
	{
		
		int res[]=new int[arr1.length];
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(i%2!=0)
				{
					res[i]=arr1[i];
				}
			}
			for(int i=0;i<arr2.length;i++)
			{
				if(i%2==0)
				{
					res[i]=arr2[i];
				}
			}
			
			
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		return res;

	}

}
