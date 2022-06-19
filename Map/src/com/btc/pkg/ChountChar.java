package com.btc.pkg;

//Java program to count frequencies of
//characters in string using Hashmap
import java.io.*;
import java.util.*;
class ChountChar 
{
	// Find the occurrences  of characters in a string
	
		// hello world
		// h : 1
		// e : 1
		// l : 3
		//   : 1
		// ...
		
		
		
		
		
		
		
	public static Map<Character, Integer> getCharCounts(String str)
	{
		TreeMap<Character, Integer> charCountMap
			= new TreeMap<Character, Integer>();

		char[] strArray = str.toCharArray();

		// traverse the input string character by character
		for (char c : strArray) {
			// check the character is already present in the map using containsKey(char)
			if (charCountMap.containsKey(c)) {
				// add the char as key and 1 as value
				
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			// else
			else {
				// get the current value and increment it by 1 and put it again
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		//for (Map.Entry entry : charCountMap.entrySet()) {
			//System.out.println(entry.getKey() + " " + entry.getValue());
		//}
		return charCountMap;
	}

	public static void main(String[] args)
	{
		String str = "hello hi bye";
		System.out.println(getCharCounts(str));
	}
}
