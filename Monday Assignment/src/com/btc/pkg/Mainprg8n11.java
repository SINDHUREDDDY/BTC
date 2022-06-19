package com.btc.pkg;
import java.util.Scanner;
public class Mainprg8n11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SIZE  ARRAY");
		int n=sc.nextInt();
		int arr1[] = new int[n];
		int arr2[]=new int[n];
		System.out.println("ENTER ARRAY 1 ELEMENTS");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("ENTER ARRAY 2 ELEMENTS");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		prg8n11.test(arr1, arr2);
		

	}

}
