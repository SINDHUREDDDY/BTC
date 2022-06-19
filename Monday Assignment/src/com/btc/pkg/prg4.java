package com.btc.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prg4 {
	public void fruitsList(List<String> list1, List<String> list2) {
		List<String> list3 = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i++) {
			String s1 = list1.get(i);
			if (s1.charAt(0) != 'a' && s1.charAt(0) != 'A' && s1.charAt(0) != 'g' && s1.charAt(0) != 'G')
				list3.add(s1);
		}
		for (int i = 0; i < list2.size(); i++) {
			String s1 = list2.get(i);
			if (s1.charAt(s1.length() - 1) != 'n' && s1.charAt(s1.length() - 1) != 'N'
					&& s1.charAt(s1.length() - 1) != 'e' && s1.charAt(s1.length() - 1) != 'E')
				list3.add(s1);
		}
		Collections.sort(list3);
		String[] s2 = new String[list3.size()];
		for (int i = 0; i < s2.length; i++)
			s2[i] = list3.get(i);
		for(String s3:s2)
			System.out.println(s3);
	}

}
