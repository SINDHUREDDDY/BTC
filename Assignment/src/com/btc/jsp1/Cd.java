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
