package com.btc.pkg1;

public class Car extends Vehicle
{
	public void musicplay(Boolean b)
	{
		if(b==true)
		{
			System.out.println(" PLAYS MUSIC");
		}
		else
		{
			System.out.println("MUSIC STOPS");
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
