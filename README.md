# Unique Arrays


import java.util.Scanner;
class UniqueArrays
{

    public static void check(int a[],int l)
    {
        int count=0;
        for(int i = 0; i < l; i++) {  
        for(int j = i + 1; j < l; j++) {  
            if(a[i] == a[j])  
            {
                count++;
            }
        }  
    }  
    if(count>=1)
    {
        System.out.println("false");
    }
    else
    {
        System.out.println("true");   
    }   
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements into array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        check(arr,n);  
    }
}


# SHORTEST WORD


public class Shortestword{

    public static void main(String args[]){
        String[] words =  {"Atrocity", "Pensive", "Imperceptible", "Discordant"};
        String shortest = words[0];
        for ( int i=0; i<words.length; i++)
        {
            if(words[i].length() <= shortest.length())
            {
                shortest = words[i];
            }
        }
        System.out.println(shortest);
    }
}


# Calorie Tracker


class Calorietracker
{

    public static void main(String[] arg)
    {
        System.out.println("Calorie burnt by cycling : 300\nCalorie burnt by running : 500\nCalorie burnt by swimming: 200\nCalorie intake in a day  : 100\n");
        int week=((300*2)+(500*2)+(200*2))*4;
        int intake=100*30;
        int calories=week-intake;
        double weightloss= calories/1000;
        System.out.println("Weight lost by Anne in a month is : " + weightloss+" pounds");
    }
}


# Fencing a Barn


import java.util.Scanner;
class FencingaBarn
{

    public static void square(double s)
    {
        System.out.println("Area of square fence for chickens is " + s*s);
    }
    public static void circular(double radius)
    {
        System.out.println("Area of circular area for the ducks is " + 3.142*radius*radius);
    }
    public static void rectangular(double l, double w)
    {
        System.out.println("Area of rectangular area for the cows is " + l*w);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" press 1 for Square area of chicken\npress 2 for circular area for ducks\npress 3 for Rectangular area for cows\n ");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1: 
                System.out.println("enter side value");
                double sides=s.nextInt();
                square(sides);
                break;
            case 2:
                System.out.println("enter radius value");
                int radius=s.nextInt();
                circular(radius);
                break;
            case 3:
                System.out.println("enter length  value");
                int l=s.nextInt();
                System.out.println("enter width value");
                int w=s.nextInt();
                rectangular(l,w);
                break;
            default:
                System.out.println("invalid value");
        } 
    }
}


# Aquarium Water pH Value


import java.util.Scanner;
public class Aquarium
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pH value of the aquarium water ");
		int ph=s.nextInt();
		if(ph<0)
		{
			System.out.println("invalid number");
		}
		else
		{
			if(ph<7)
			{
				System.out.println("pH value is low, partial water change required");
			}
			else if(ph==7 || ph==8)
			{
				System.out.println("pH value is fine");
			}
			else
			{
				System.out.println("pH value is high, partial water change required");
			}
		}
	}

}



# Bookstore

package com.btc.pkg1;

public class Book 
{

	private int isbnNo;
	private String bookName;
	private String author;
	private String genre;
	private double price;
	public int getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbnNo=" + isbnNo + ", bookName=" + bookName + ", author=" + author + ", genre=" + genre
				+ ", price=" + price + "]";
	}
	
}


package com.btc.pkg1;

public class Bookstore 
{

	private String bookStoreName;
	private String bookStoreId;
	private Book[] books;
	public String getBookStoreName() {
		return bookStoreName;
	}
	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}
	public String getBookStoreId() {
		return bookStoreId;
	}
	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	// Function to calculate the discount for a genre of books
    public void calculateDiscount(Book book,double discountPercentage)
    {
    	String gen=book.getGenre();
    	if(gen.equals("fiction"))
    	{
    		double dis=book.getPrice()-(book.getPrice()*(discountPercentage/100));
    		book.setPrice(dis);
            System.out.println("~~BOOK DETAILS AFTER DISCOUNT~~  \n" +book+"\n");
    	} 
    }
}


package com.btc.pkg1;

public class BookStoreImp1 {

	public static void main(String[] args) 
	{
		Book b=new Book();
		b.setIsbnNo(1254);
		b.setBookName("u can win");
		b.setAuthor("abc");
		b.setGenre("fiction");
		b.setPrice(500);
		System.out.println("~~BOOK DETAILS BEFORE DISCOUNT~~ \n"+b+"\n");
		Book[] bb=new Book[1];
		bb[0]=b;
		Bookstore b1=new Bookstore();
		b1.setBookStoreName("ABC store");
		b1.setBookStoreId("ID-bookstore");
		b1.setBooks(bb);
		b1.calculateDiscount(b, 25);
		System.out.println("---------------------------------------------------------------------------------");
		Book b3=new Book();
		b3.setIsbnNo(12);
		b3.setBookName("Vegg...");
		b3.setAuthor("aaa");
		b3.setGenre("cooking");
		b3.setPrice(350);
		System.out.println("~~BOOK DETAILS BEFORE DISCOUNT~~ \n"+b3);
		Book[] bb1=new Book[1];
		bb1[0]=b3;	
		Bookstore b4=new Bookstore();
		b4.setBookStoreName("ABC store");
		b4.setBookStoreId("88-bookstore");
		b4.setBooks(bb1);
		b4.calculateDiscount(b3, 25);
	}
}




# Inheritance


package com.btc.pkg1;

public class Bike extends Vehicle
{

	public static void accletate(Boolean b)
	{
		if(b==true)
		{
			System.out.println("BIKE MOVES");
		}
		else
		{
			System.out.println("BIKE STOPS");
		}
		
	}

}


package com.btc.pkg1;

public class Bus extends Vehicle
{

	public static void horn(Boolean b)
	{
		if(b==true)
		{
			System.out.println("HORN");
		}
		else
		{
			System.out.println("NO HORN");
		}
	}


}


package com.btc.pkg1;

public class Car extends Vehicle

{

	public void musicplay(Boolean b)
	{
		if(b==true)
		{
			System.out.println(" PLAYS MUSIC");
		}
		else
		{
			System.out.println("MUSIC STOPS");
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}


package com.btc.pkg1;

public class Vehicle 
{

	private String vehiclename;
	private String regno;
	
	
	public String getVehiclename() {
		return vehiclename;
	}


	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}


	public String getRegno() {
		return regno;
	}


	public void setRegno(String regno) {
		this.regno = regno;
	}


	@Override
	public String toString() {
		return "Vehicle [vehiclename=" + vehiclename + ", regno=" + regno + "]";
	}
	
}




package com.btc.pkg1;

public class Main {

	public static void main(String[] args) 
	{
		
		Car c=new Car();
		c.setVehiclename("Car");
		c.setRegno("KA 05 1111");
		System.out.println(c);
		c.musicplay(true);
		System.out.println("------------------------------------------------------");
		
		Bus b =new Bus();
		b.setVehiclename("BUS");
		b.setRegno("KA 05 2222");
		System.out.println(b);
		b.horn(true);
		System.out.println("------------------------------------------------------");

		
		Bike b1=new Bike();
		b1.setVehiclename("BIKE");
		b1.setRegno("KA 05 3333");
		System.out.println(b1);
		b1.accletate(false);

	}

}




# Score of Students


package com.btc.pkg1;

public class StudentMarks 
{

	/* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths) {


        return physics+chemistry+maths;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {


        return physics+chemistry+maths+bio;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {


        return physics+chemistry+maths+bio;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {


        return maths+bio+physics+chemistry+lang;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {



        return maths+bio+physics+chemistry;
    }
    public static void main(String[] args) 
    {
    	System.out.println("Float Static method "+calculateMarks(65f,88f,56f,67f,77f));
    	StudentMarks s=new StudentMarks();
    	System.out.println("Float NonStatic Method "+s.calculateMarks(65f,88f,56f,67f));
    	System.out.println("Double NonStatic Method "+s.calculateMarks(56.0, 95, 65, 70.0));
    	System.out.println("Integer Method with 4 values " +s.calculateMarks(60, 70, 58, 88));
    	System.out.println("Integer Method with 3 values " +s.calculateMarks(70, 58, 88));
		
	}

}



# A Mobile Phone List


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



package com.btc.pkg;


public class Mobile {

    private String brandName;
    private String modelName;
    private double cost;
    private String screenSize;
    private String batteryLife;
    private String storageSpace;
    private int cameraPixels;
    //getter and setter
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}
	public String getStorageSpace() {
		return storageSpace;
	}
	public void setStorageSpace(String storageSpace) {
		this.storageSpace = storageSpace;
	}
	public int getCameraPixels() {
		return cameraPixels;
	}
	public void setCameraPixels(int cameraPixels) {
		this.cameraPixels = cameraPixels;
	}
	//constructor
	public Mobile(String brandName, String modelName, double cost, String screenSize, String batteryLife,
			String storageSpace, int cameraPixels) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.cost = cost;
		this.screenSize = screenSize;
		this.batteryLife = batteryLife;
		this.storageSpace = storageSpace;
		this.cameraPixels = cameraPixels;
	}
	//toString method
	@Override
	public String toString() {
		return "Mobile \n[brandName=" + brandName + ", modelName=" + modelName + ", cost=" + cost + ", screenSize="
				+ screenSize + ", batteryLife=" + batteryLife + ", storageSpace=" + storageSpace + ", cameraPixels="
				+ cameraPixels + "]\n";
	}
	
}



package com.btc.pkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MobileStore 
{
	
	


    public MobileStore()
    {
    	

    }
    public List<Mobile> addValues()
    {
    	List<Mobile> list=new ArrayList<Mobile>();
    	Mobile m1=new Mobile("Samsung", "Samsung M55", 46000,"6.7inches", "5000mAh", "128GB RAM", 32);
		Mobile m2=new Mobile("Samsung", "Samsung M33", 20000,"5.7inches", "3000mAh", "64GB RAM", 12);
		Mobile m3=new Mobile("Apple", "iphone 13", 79000,"6.1inches", "3000mAh", "128GB ", 12);
		Mobile m4=new Mobile("Apple", "iphone SE", 32000,"4.7inches", "1821mAh", "64GB ", 7);
		Mobile m5=new Mobile("Vivo", "Vivo Y75", 21000,"6.44inches", "4050mAh", "128GB ", 7);
		Mobile m6=new Mobile("Oneplus", "OnePlus 10R", 40000,"6.7inches", "5000mAh", "128GB ", 16);
		
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
    	return list;
    }
   
    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
    	List<Mobile> lists=addValues();
		 lists= lists.stream().filter( s ->  s.getBrandName().equalsIgnoreCase(brandName)).collect(Collectors.toList());
    	//System.out.println(lists);
		return lists;
    	
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {
    	List<Mobile> lists1=addValues();
		 lists1=lists1.stream().filter(s -> s.getCost()>=39000).collect(Collectors.toList());

      return lists1;
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
    	List<Mobile> lists=addValues();
		lists=lists.stream().filter(s -> s.getCameraPixels()>=12).collect(Collectors.toList());
    	
        return lists;
    }





	


}



# Expensive item

package com.btc.pkg1;

public class Main {

	public static void main(String[] args) 
	{
		
		Item i1=new Item(12,"Book",522.2);
		Item i2=new Item(5,"Box",20);
		Item i3=new Item(52,"Dress",999);
		Item [] i=new Item[5];
		i[0]=i1;
		i[1]=i2;
		i[2]=i3;
		double exp=i[0].getPrice();
		String name=i[0].getName();
		for(int j=0;j<=i.length-1;j++)
		{
			if(i[j]==null)
			{
				break;
			}
			else
			{
				System.out.println(i[j]);
				
				for(int k=0;k<i.length;k++)
				{
					for(int l=k+1;l<i.length;l++)
					{
						if(i[l]==null)
						{
							break;
						}
						else if(i[k].getPrice()<i[l].getPrice())
						{
							exp=i[l].getPrice();
							name=i[l].getName();
							break;
						}
					}	
				}	
			}		
		}
		System.out.println("Expensive item is "+name);
		
	}
}


package com.btc.pkg1;


public class Item 
{

	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public static void t()
	{
		System.out.println("STATIC ");
	}
}



# Report Generation

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
					
package com.btc.pkg1;
public class Student {

	private int rollNo;
	private String studentName;
	private int mathsScore;
	private int chemistryScore;
	private int physicsScore;
	
	private int total;
	
	
	public Student() {
	}


	public Student(int rollNo, String studentName, int mathsScore, int chemistryScore, int physicsScore) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.mathsScore = mathsScore;
		this.chemistryScore = chemistryScore;
		this.physicsScore = physicsScore;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMathsScore() {
		return mathsScore;
	}


	public void setMathsScore(int mathsScore) {
		this.mathsScore = mathsScore;
	}


	public int getChemistryScore() {
		return chemistryScore;
	}


	public void setChemistryScore(int chemistryScore) {
		this.chemistryScore = chemistryScore;
	}


	public int getPhysicsScore() {
		return physicsScore;
	}


	public void setPhysicsScore(int physicsScore) {
		this.physicsScore = physicsScore;
	}


	public int getTotal() {
		return getPhysicsScore()+getChemistryScore()+getMathsScore();
	}


	public void setTotal(int total) 
	{
		this.total =total;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", mathsScore=" + mathsScore
				+ ", chemistryScore=" + chemistryScore + ", physicsScore=" + physicsScore + ", total=" + total + "]";
	}
	
	
	
	
}
					
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

					
					
# Assignment
					
					package com.btc.jsp1;

public class Book extends WrittenItem
{
					
	public Book(int identificationnumber, String title, int numberofcopies, String authorname) {
		super(identificationnumber, title, numberofcopies, authorname);
		// TODO Auto-generated constructor stub
	}
	@Override
	void showauthordetails() {
		System.out.println("author name = "+super.authorname+"\n book name = " +super.getTitle());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Book class---------print..................");
		
	}

	@Override
	public void checkin() {
		// TODO Auto-generated method stub
		System.out.println("Book class-------checked in................");
		
	}

	@Override
	public void checkout() {
		System.out.println("Book class-------checked out...............");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void additem() {
		System.out.println("Book class------Item added..............");
		// TODO Auto-generated method stub
		
	}

}

					
					package com.btc.jsp1;

public class Cd extends MediaItem
{
	
	String artist;
	String genre;

	public Cd(int identificationnumber, String title, int numberofcopies, int runtime,String artist,String genre) {
		super(identificationnumber, title, numberofcopies, runtime);
		// TODO Auto-generated constructor stub
		this.artist=artist;
		this.genre=genre;
	}

	@Override
	public void show_details_media() 
	{
		System.out.println("artist = "+artist+"\ngenre ="+genre);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Cd class------------ print----------");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkin() {
		// TODO Auto-generated method stub
		System.out.println("Cd class------------ checked in----------");

	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		System.out.println("Cd class------------ checked out----------");

	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("Cd class------------ item added----------");

		
	}
	

}

					
package com.btc.jsp1;

public abstract class Item 
{
	
	private int identificationnumber;
	private String title;
	private int numberofcopies;
	public Item(int identificationnumber, String title, int numberofcopies) {
		super();
		this.identificationnumber = identificationnumber;
		this.title = title;
		this.numberofcopies = numberofcopies;
	}
	public int getIdentificationnumber() {
		return identificationnumber;
	}
	public void setIdentificationnumber(int identificationnumber) {
		this.identificationnumber = identificationnumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberofcopies() {
		return numberofcopies;
	}
	public void setNumberofcopies(int numberofcopies) {
		this.numberofcopies = numberofcopies;
	}
	@Override
	public String toString() {
		return "Item [identificationnumber=" + identificationnumber + ", title=" + title + ", numberofcopies="
				+ numberofcopies + "]";
	}
	public abstract void print();
	public abstract void checkin();
	public abstract void checkout();
	public abstract void additem();

}

					
package com.btc.jsp1;

public class JournalPaper extends WrittenItem
{

	String year_published;

	public JournalPaper(int identificationnumber, String title, int numberofcopies, String authorname, String year_published) {
		super(identificationnumber, title, numberofcopies, authorname);
		this.year_published=year_published;
		// TODO Auto-generated constructor stub
	}

	@Override
	void showauthordetails() 
	{
		System.out.println("year of published = " +year_published);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("JournalPape class---------- print............");
	}

	@Override
	public void checkin() {
		// TODO Auto-generated method stub
		System.out.println("JournalPape class---------check in.......");
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		System.out.println("JournalPape class---------checked out.......");
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("JournalPape class---------- item added..........");
	}
	
	

}

					
package com.btc.jsp1;

public class Main {

	public static void main(String[] args) {
		WrittenItem b=new Book(12, "YOU CAN WIN", 150, "AUTHOR_ABC");
		System.out.println(b);
		b.showauthordetails();
		b.additem();
		b.checkin();
		b.checkout();
		b.print();
		WrittenItem w=new JournalPaper(8, "SKY HIGH", 265,"Jay", "JAN-20-2020");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(w);
		w.showauthordetails();
		w.additem();
		w.checkin();
		w.checkout();
		w.print();
		System.out.println("-------------------------------------------------------------------------------------------");
		MediaItem m=new Video(77, "The Secret", 987, 1365, "Rhonda", "Spiritual", "Nov-2006");
		System.out.println(m);
		m.show_details_media();
		m.additem();
		m.checkin();
		m.checkout();
		m.print();
		System.out.println("-------------------------------------------------------------------------------------------");
		MediaItem m1=new Cd(77, "Anything", 70, 125, "abc", "Cooking");
		System.out.println(m1);
		m1.show_details_media();
		m1.additem();
		m1.checkin();
		m1.checkout();
		m1.print();
		
	}

}

package com.btc.jsp1;

public abstract class MediaItem extends Item 
{
					
	int runtime;

	public MediaItem(int identificationnumber, String title, int numberofcopies, int runtime) {
		super(identificationnumber, title, numberofcopies);
		// TODO Auto-generated constructor stub
		this.runtime=runtime;
	}
	
	public abstract void show_details_media();

	@Override
	public String toString() {
		return super.toString()+ "\nMediaItem [runtime=" + runtime + "]";
	}
	
}

					
package com.btc.jsp1;

public class Video extends MediaItem 
{
					
	String director;
	String genre;
	String year_released;

	public Video(int identificationnumber, String title, int numberofcopies, int runtime,String director,String genre,String year_released) 
	{
		super(identificationnumber, title, numberofcopies, runtime);
		// TODO Auto-generated constructor stub
		this.director=director;
		this.genre=genre;
		this.year_released=year_released;
	}

	@Override
	public void show_details_media() {
		System.out.println("director = " +director+"\ngenre = "+genre+"\nyear_released = " +year_released);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Video class---------- print----------");
		
	}

	@Override
	public void checkin() {
		// TODO Auto-generated method stub
		System.out.println("Video class---------- checked in----------");

	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		System.out.println("Video class---------- checked out----------");

	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("Video class---------- item added----------");
	}
	

}

					
package com.btc.jsp1;

public abstract class WrittenItem extends Item
{
					
	String authorname;
	public WrittenItem(int identificationnumber, String title, int numberofcopies, String authorname) {
		super(identificationnumber, title, numberofcopies);
		this.authorname=authorname;
		// TODO Auto-generated constructor stub
	}

	abstract void showauthordetails();

	@Override
	public String toString() {
		return super.toString() +"\nWrittenItem [authorname=" + authorname + "]";
	}
	
}

					
# Monday Assignment
					
package com.btc.pkg;

public class Mainprg10 {

	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4};
		int arr2[]= {3,4,5,6};
		System.out.println(prg10.test(arr1, arr2));
		

	}

}

					package com.btc.pkg;

public class prg10 {

	public static int test(int arr1[],int arr2[]) 
	{
		
		int sum=0;
		int count=0;
		int logic[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(count<arr1.length)
					{
						logic[count]=arr1[i];
						count++;
					}
				}
			}
		}
		for(int i=0;i<logic.length;i++)
		{
			if(logic[i]!=0)
			{
				sum=sum+logic[i];
				
			}
			
		}
		return sum;

	}

}

					
					package com.btc.pkg;

public class prg13 {
	public static void test(int input1, int input2) {
		
		int sum = 0;
		for (int i = input1; i <= input2; i++) {

			boolean b = isPalindrome(i);
			if (b) {

				sum = sum + i;
			}

		}
		System.out.println(sum);

	}

	private static boolean isPalindrome(int i) {
		int temp = i, rev = 0;
		do {
			int digit = i % 10;
			rev = rev * 10 + digit;
			i = i / 10;

		} while (i > 0);

		return rev == temp;
	}

}

					
					package com.btc.pkg;
import java.util.Scanner;
public class Mainprg13 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value");
		int input1 = sc.nextInt();
		System.out.println("enter the second value");
		int input2 = sc.nextInt();
		prg13.test(input1, input2);

	}

}

					
					package com.btc.pkg;

public class prg3 
{
	public static int[] check(int arr1[],int arr2[]) 
	{
		
		int res[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]!=arr2[j])
				{
					for(int k=0;k<res.length;k++)
					{
						res[k]=arr1[i];
						res[k+1]=arr2[j];
						break;
					}
				}
			}
		}
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
			{
				System.out.print(res[i]+" ");
				
			}
			
		}
		return res;
		
	}
}

					
					package com.btc.pkg;

public class Mainprg3 {

	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,2,3,5};
		System.out.println(prg3.check(arr1,arr2));
		// TODO Auto-generated method stub

	}

}

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

					
					package com.btc.pkg;
import java.util.Scanner;
public class Mainprg5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING IN THE ORDER OF    AAAAA*AAAAA");
		String str=sc.nextLine();
		prg5.test(str);
		

	}

}

					
					package com.btc.pkg;

public class prg5 {

	public static void test(String str) 
	{
		int i=str.indexOf('*');
		String str1=str.substring(0, i);
		String str2=str.substring(i+1, str.length());
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}

					
					package com.btc.pkg;

public class prg8n11 {

	public static int[] test(int[] arr1,int []arr2) 
	{
		
		int res[]=new int[arr1.length];
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(i%2!=0)
				{
					res[i]=arr1[i];
				}
			}
			for(int i=0;i<arr2.length;i++)
			{
				if(i%2==0)
				{
					res[i]=arr2[i];
				}
			}
			
			
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		return res;

	}

}

					
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

					
					package com.btc.pkg;

import java.util.Arrays;

public class prg9 {

	public static void sort(int size,String[] list,int index) 
	{
		System.out.println("Before Sorted ");
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]+"\t");
		}
		     
		for(int i = 0; i<size-1; i++)   
		{  
		for (int j = i+1; j<list.length; j++)   
		{  
		//compares each elements of the array to all the remaining elements  
		if(list[i].compareTo(list[j])>0)   
		{  
		//swapping array elements  
		String temp = list[i];  
		list[i] = list[j];  
		list[j] = temp;  
		}  
		}  
		}  
		//prints the sorted array in ascending order  
		System.out.print("\nAfter Sorting\n"+Arrays.toString(list));  
		reverse(list,index);

	}
	public static void reverse(String[] str, int index)
	   {
	      for(int a = 0; a < str.length / 2; a++)
	      {
	         String strTemp = str[a];
	         str[a] = str[str.length - a - 1];
	         str[str.length - a - 1] = strTemp;
	      }
	      System.out.println("\nReversed string array: ");
	      for(int a = 0; a < str.length; a++)
	      {
	         System.out.print(str[a]+"\t");
	         
	      }
	      if(index==1)
	      {
    		  System.out.println("\nEntered index is 1 so printing 0th index of reversed array:\n"+str[0]);
	      }
	   }

}
