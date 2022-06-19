package com.btc.pkg1;

public class Main {

	public static void main(String[] args) 
	{
		
		Car c=new Car();
		c.setVehiclename("Car");
		c.setRegno("KA 05 1111");
		System.out.println(c);
		c.musicplay(true);
		System.out.println("------------------------------------------------------");
		
		Bus b =new Bus();
		b.setVehiclename("BUS");
		b.setRegno("KA 05 2222");
		System.out.println(b);
		b.horn(true);
		System.out.println("------------------------------------------------------");

		
		Bike b1=new Bike();
		b1.setVehiclename("BIKE");
		b1.setRegno("KA 05 3333");
		System.out.println(b1);
		b1.accletate(false);

	}

}
