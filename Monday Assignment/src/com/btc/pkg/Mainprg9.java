package com.btc.pkg;
import java.util.*;
import java.util.Arrays;

public class Mainprg9 {

	public static void main(String[] args) {
		String[] name = {"red", "green", "blue", "ivory"};  
		int size = name.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER INDEX\n");
		int index=sc.nextInt();
		prg9.sort(size,name,index);
		System.out.println();
		

	}
	

}
