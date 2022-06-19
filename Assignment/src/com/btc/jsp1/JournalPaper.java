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
