package com.btc.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) 
	{
		Employee e1=new Employee("Sindhu", 10, 50000);
		Employee e2=new Employee("aru", 18, 55000);
		Employee e3=new Employee("Indhu", 20, 35000);
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		List<Employee> newList= list.stream().filter(s -> s.getSal()>=40000).collect(Collectors.toList());
		System.out.println(newList);
		//newList.forEach(lists-> System.out.println(newList));
		//List<String> names = Arrays.asList("Gaurav","Suraj","Mohit","Javed","Harsh","Supriya");

		// Find the people whose name starts with s

		// convert the names to uppercase and store it to a new list


		//List<String> namesInUppercase = names.stream().filter(s->s.startsWith("S"))
													//.map(s->s.toUpperCase())
													//.collect(Collectors.toList());
		//System.out.println(namesInUppercase);
		
		// create a list of integers
		//List<Integer> number= Arrays.asList(3,7,2,1,6,4,9,5);
		
		// find all the odd integers and square them and add them to a new list
		//List<Integer> num= number.stream().filter(s -> s % 2 !=0)
			//							  .map(s-> (s*s))
				//						  .collect(Collectors.toList());
		//System.out.println(num);
		
		

	}



}