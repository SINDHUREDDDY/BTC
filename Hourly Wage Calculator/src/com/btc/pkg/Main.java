package com.btc.pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the employee");
		String name=sc.nextLine();
		System.out.println("Enter base pay of the employee");
		double basePay=sc.nextDouble();
		System.out.println("Enter number of hours worked by the employee");
		double hrsWorked=sc.nextDouble();
		
		Employee e1=new Employee(name,basePay,hrsWorked);
		 System.out.println("Name :: "+name+"\nBase Pay :: "+basePay+"$"+"\nHours Worked :: "+hrsWorked+"\nSalary of Employee :: "+e1.calculate(basePay, hrsWorked)+"$");

	}

}
