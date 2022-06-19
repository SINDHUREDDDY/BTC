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
