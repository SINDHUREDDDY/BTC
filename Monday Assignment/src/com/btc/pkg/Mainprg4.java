package com.btc.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainprg4

{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		 list1.add("apple");
		 list1.add("orange");
		 list1.add("grapes");
		 ArrayList list2=new ArrayList();
		 list2.add("melon");
		 list2.add("apple");
		 list2.add("mango");
		prg4 p=new prg4();
		p.fruitsList(list1, list2);
		
	}
		

}
