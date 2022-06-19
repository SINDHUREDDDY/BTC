package com.btc.pkg;
import java.util.HashMap;
public class prg1 {

	public static void main(String[] args) 
	{
		String str[]= {"goa","kerala","gujarat"};
		// TODO Auto-generated method stub
		HashMap <String ,String >h=new HashMap<String ,String >();
		for(int i=0;i<str.length;i++)
		{
			String key=str[i].toUpperCase().substring(0,3);
			h.put(key, str[i]);
		}
		for(String key:h.keySet()) {
			System.out.print("{"+key+" : "+h.get(key)+"}"+"\t");
		}

	}

}
