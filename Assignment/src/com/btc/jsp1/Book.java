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
