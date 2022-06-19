package com.btc.pkg1;

public class Address 
{
	String area;
	String city;
	 public Address(){
	        //default constructor
	    }
	    public Address(String area, String city) 
	    {
		super();
		this.area = area;
		this.city = city;
	}



		public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


	@Override
		public boolean equals(Object other) 
	    {
			Boolean res=false;
			if(other==this)
			{
				res=true;
			}
			if(!(other instanceof Address))
			{
				res=false;
			}
			Address a=(Address) other;
			
	        return area.equals(a.area)&&city.equals(a.city);
	    }
}
