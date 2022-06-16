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


#Aquarium Water pH Value


import java.util.Scanner;
public class Aquarium {
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



#Bookstore


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

