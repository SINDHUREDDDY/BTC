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
