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
