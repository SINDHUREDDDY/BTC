package com.btc.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		List<Student> studentList;
			Student s1 = new Student(1001, "Harsh", 85, 77, 82);
			s1.setTotal(s1.getTotal());
			Student s2 = new Student(1002, "Priya", 57, 35, 63);
			Student s3 = new Student(1003, "Suraj", 32, 71, 61);
			Student s4 = new Student(1004, "Anil", 55, 52, 61);
			Student s5 = new Student(1009, "Arul", 95, 92, 97);
			s2.setTotal(s2.getTotal());
			s3.setTotal(s3.getTotal());
			s4.setTotal(s4.getTotal());
			s5.setTotal(s5.getTotal());
			
			Comparator<Student> g=new getRollNumber();
			studentList = new ArrayList<>();
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);
			studentList.add(s5);
			
			ReportGeneration r=new ReportGeneration();
			
			System.out.println();
			r.getPassedOutStudents(studentList);
			System.out.println();
			r.getStudentsForRetest(studentList);
			System.out.println();
			r.getStudentGrades(studentList);
			System.out.println();
			System.out.println("CLASS TOPPER IN ORDER ");
			
			Collections.sort(studentList,g);
			for(int i=0;i<studentList.size();i++)
			{
				System.out.println("ROLL NUMBER OF " +(i+1)+ "th: "+studentList.get(i).getRollNo());
			}
			//r.getStudentRollNumber(studentList);
	}

}
