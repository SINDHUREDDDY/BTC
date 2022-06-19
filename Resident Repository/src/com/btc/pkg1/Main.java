package com.btc.pkg1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws DuplicateResidentException, ResidentNotFoundException 
	{
		Resident r=new Resident("Sindhu", 126, 'F');
 	    Resident r2=new Resident("Aru", 123, 'F');
 	    Resident r3=new Resident("Indhu", 1, 'F');
 	    Resident r4=new Resident("Ravi", 12, 'M');
 	    List <Resident> list=new ArrayList<Resident> ();
 	    list.add(r);
 	    list.add(r2);
 	    list.add(r3);
 	    list.add(r4);
		
   	 	Resident r1=new Resident("Sin", 1256, 'F');
   	 	ResidentService rr=new ResidentService();
   	 	boolean res=rr.addResident(list,r1);
   	 	if(res)
   	 	{
   	 		list.add(r1);
   	 	}
   	 	System.out.println("----------------------------------------------------------");
   	 	System.out.println(rr.searchResident(list, 1256));
   	 	
   	
   	 	System.out.println("----------------------------------------------------------");
   	 	
   	 	System.out.println("-----After Sorting------");
   	 	rr.getAllNamesSorted(list);
   	 	
   	 	System.out.println("----------------------------------------------------------");
   	 	System.out.println("------Sorting based on Gender------");
   	 	rr.getAllResidentsByGender(list,'F');
   	 	
	}

}
