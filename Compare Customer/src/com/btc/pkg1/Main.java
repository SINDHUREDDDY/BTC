package com.btc.pkg1;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) 
	{
	
		Address a=new Address("RRnagar","Bangalore");
		Address a1=new Address("RRnagar","Bangalore");
		Boolean res=a.equals(a1);
		if(res)
		{
			Customer c=new Customer(101,"John","john@gmail.com",a);
			Customer c1=new Customer(101,"John","john@gmail.com",a1);
			Boolean res1=c.equals(c1);
			if(res1)
			{
				System.out.println("The customers are the same.");
			}
			else
			{
				System.out.println("The customers are NOT the same.");
			}
			
		}
		else
		{
			System.out.println("The customers are NOT the same.");

		}
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("gmail","albert.eisntein@gmail.com");
		h.put("yahoo","jagadish_chandra_bose@yahoo.com");
		h.put("gmail", "srinivasa.ramanujan@gmail.com");
		h.put("yahoo", "bjarne_stroustrup@yahoo.com");
		h.put("gmail", "max.planck@gmail.com");
		h.put("hotmail", "nikola.tesla@hotmail.com");
		h.put("hotmail", "galileo_galilei@hotmail.com");
		h.put("gmail", "a.p.j.abdul.kalam@gmail.com");
		h.put("gmail", "richard.stallman@inbox.com");

	}

}
