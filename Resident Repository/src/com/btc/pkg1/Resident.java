package com.btc.pkg1;

import java.util.List;

public class Resident 
{
	 //declare the variables
	private String name;
	private int socialSecurityNumber;
	private char gender;
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	//constructor
	
	public Resident(String name, int socialSecurityNumber, char gender) {
		super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.gender = gender;
	}
	public Resident() {
		// TODO Auto-generated constructor stub
	}
	//override toString method
	@Override
	public String toString() {
		return "Resident [name=" + name + ", socialSecurityNumber=" + socialSecurityNumber + ", gender=" + gender + "]\n";
	}
	
	
	

	

    
	

    

    

}
