package com.btc.pkg1;

public class Bus extends Vehicle
{
	public static void horn(Boolean b)
	{
		if(b==true)
		{
			System.out.println("HORN");
		}
		else
		{
			System.out.println("NO HORN");
		}
	}


}
