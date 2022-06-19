package com.btc.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		//  500$ = 39,011.53
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand name as given below: \nSamsung\nVivo\nApple\nOnePlus");
		String str=sc.nextLine();
		MobileStore m=new MobileStore();
		System.out.println();
		System.out.println("------Mobile Based on brand name-----");
		List<Mobile> phoneBrand = m.findPhoneByBrand(str);
		System.out.println(phoneBrand);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("------Mobile Based on price More Than 500$-----");
		List<Mobile> phoneMoreThan500 = m.findPhoneCostMoreThan500$();
		System.out.println(phoneMoreThan500);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("------Mobile Based on camera specification as 12 MP and more-----");

		List<Mobile> pixelMoreThan12 = m.findPhonePixelMoreThan12MP();
		System.out.println(pixelMoreThan12);

	}
	

}
