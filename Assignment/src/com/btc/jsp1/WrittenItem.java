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
