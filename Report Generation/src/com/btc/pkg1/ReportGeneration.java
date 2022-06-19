package com.btc.pkg1;


import java.util.Comparator;
import java.util.List;
class getRollNumber implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		
		return s2.getTotal()-s1.getTotal();
	}
}


public class ReportGeneration {
	Student s=new Student();
	public int[] totalscore(List<Student> studentList)
	{
		int res[]=new int[studentList.size()];
		for(int i=0;i<res.length;i++)
		{
			res[i]=studentList.get(i).getTotal();
		}
		return res;
	}
	
	
	public String getTopScorer(List<Student> studentList)
	{
		String name=null;
		//calculating top marks scored by the students and showing name
		int res[]=totalscore(studentList);
		int large=res[0];
		int largeindex=0;
		for(int i=0;i<studentList.size();i++)
		{
			if(large<res[i])
			{
				large=res[i];
				largeindex=i;
			}
			
		}
		name=studentList.get(largeindex).getStudentName();
		return name;
	}
	
	public void getPassedOutStudents(List<Student> studentList)
	{
		for(int i=0;i< studentList.size();i++)
		{
			if( studentList.get(i).getChemistryScore()>=50 && studentList.get(i).getMathsScore()>=50 && studentList.get(i).getPhysicsScore()>=50)
			{
		
				System.out.println("STUDENT NAMES WHO PASSED THE EXAM "+studentList.get(i).getStudentName());
			}
		}
	}
	
	public void getStudentsForRetest(List<Student> studentList)
	{
		for(int i=0;i< studentList.size();i++)
		{
			if( studentList.get(i).getChemistryScore()<50 || studentList.get(i).getMathsScore()<50 || studentList.get(i).getPhysicsScore()<50)
			{
		
				System.out.println("STUDENT NAMES WHO FAILED IN THE EXAM (MARKS < 50) "+studentList.get(i).getStudentName());
			}
		}
		
	}
	
	public void getStudentGrades(List<Student> studentList)
	{
		char grade = 0;
		int[] total=totalscore(studentList);
		for(int i=0;i<total.length;i++)
		{
			if( studentList.get(i).getChemistryScore()<50 || studentList.get(i).getMathsScore()<50 || studentList.get(i).getPhysicsScore()<50)
			{
				grade='F';
				System.out.println("STUDENT NAME "+ studentList.get(i).getStudentName()+" GRADE: "+grade);

			}
			else if(total[i]>=150 && total[i]<200)
			{
				grade='C';
				System.out.println("STUDENT NAME "+ studentList.get(i).getStudentName()+" GRADE: "+grade);
			}else if(total[i]>=200 && total[i]<250)
			{
				
				grade='B';
				System.out.println("STUDENT NAME "+ studentList.get(i).getStudentName()+" GRADE: "+grade);
				
			}
			else if(total[i]>=250)
			{
				
				grade='A';
				System.out.println("STUDENT NAME "+ studentList.get(i).getStudentName()+" GRADE: "+grade);
			}
		}
		
	}
	//public void getStudentRollNumber(List<Student> studentList)
	//{
		//int[] initial=totalscore(studentList);
		//int[] total=totalscore(studentList);
		//for(int i=0;i<total.length;i++)
		//{
			//for(int j=i+1;j<total.length;j++)
			//{
				//if(total[i]<total[j])
				//{
					//int temp=total[i];
					//total[i]=total[j];
					//total[j]=temp;
				//}
			//}
			
		//}
		//System.out.println("Displays the roll numbers of the students on the class board in descending order of the total marks scored in the exam");
		//for(int i=0;i<initial.length;i++)
		///{
			//for(int j=0;j<total.length;j++)
			///{
				//if(total[i]==initial[j])
				///{
					//System.out.println("ROLL NUMBER OF " +(i+1)+ "th: "+studentList.get(j).getRollNo());
				//}
			//}
		//}
		//for(int i=0;i<total.length;i++)
		//{
			//System.out.println(studentList.get(i).getRollNo());
		//}
		
	//}
    
}