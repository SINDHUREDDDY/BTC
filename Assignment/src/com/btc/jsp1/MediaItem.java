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
