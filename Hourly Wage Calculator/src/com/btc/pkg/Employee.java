package com.btc.pkg;

public class Employee 
{
	private String name;
	private double basePay;
	private double hrsWorked;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasePay() {
		return basePay;
	}
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	public double getHrsWorked() {
		return hrsWorked;
	}
	public void setHrsWorked(double hrsWorked) {
		this.hrsWorked = hrsWorked;
	}
	public Employee(String name, double basePay, double hrsWorked) {
		super();
		this.name = name;
		this.basePay = basePay;
		this.hrsWorked = hrsWorked;
	}
	@Override
	public String toString() {
		return "Employee [Name :: " + name + ", Base Pay :: " + basePay + "$"+", Hours Worked :: " + hrsWorked + "]";
	}
	public double calculate(double basePay,double hrsWorked) 
	{
		double res=0;
		if(getBasePay()<12 || getHrsWorked()>60)
		{
			return 0;
		}
		else
		{
			if(getHrsWorked()>=40 && getHrsWorked()<60)
			{
				
				double extra=getHrsWorked()%10;
				res=(getHrsWorked()*12)+(extra*12);
			}
		}
		return res;
	

}
}
