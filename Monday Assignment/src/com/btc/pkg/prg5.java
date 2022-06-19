package com.btc.pkg;

public class prg5 {

	public static void test(String str) 
	{
		int i=str.indexOf('*');
		String str1=str.substring(0, i);
		String str2=str.substring(i+1, str.length());
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
