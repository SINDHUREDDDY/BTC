package com.btc.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

 class DuplicateResidentException  extends Exception{

	public DuplicateResidentException(String string) {
		// TODO Auto-generated constructor stub
	}
	
}
 
 class ResidentNotFoundException extends Exception{

	public ResidentNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}
	 
 }


public class ResidentService {

    private static List<Resident> residentsRepository = new ArrayList<>();
 
    ResidentService()
    {
    	
    }
    /**
     * create list of all the residents.
     */
    public boolean addResident(List<Resident> list,Resident resident) throws DuplicateResidentException 
    {
    	boolean res=false; 
    	
    	for(int i=0;i<list.size();i++)
    	{
    		if(resident.getName().equalsIgnoreCase(list.get(i).getName()))
        	{
        		try {
        			throw new DuplicateResidentException("Duplicate Resident");
        			
        		}
        		catch(DuplicateResidentException ex)
        		{
        			System.out.println(ex.getMessage());
        		}
        		return false;
        	}
    		else if(list.get(i)==null)
    		{
    			break;
    		}
        	else
        	{
        		System.out.println("-----Before adding Resident details-----");
        		System.out.println(list);
        		list.add(resident);
        		//System.out.println(r+"\n");
        		System.out.println();
        		res=true;
        		System.out.println("-----after adding Resident details-----");
        		System.out.println(list);
        		System.out.println("Resident ADDED");
        		break;
        	}
    		
    		
    	}
    	
        return res;
    }

   //Search for people with their social security number.
    

    public Resident searchResident(List<Resident> list,int socialSecurityNumber) throws ResidentNotFoundException
    {
    	//List<Resident> resident=new ArrayList<Resident>();
    	Resident r=new Resident() ;
    	for(int i=0;i<list.size();i++)
    	{
    		if(list.get(i).getSocialSecurityNumber()!=socialSecurityNumber)
    		{
    			continue;
    		}
    		else if(list.get(i).getSocialSecurityNumber()==socialSecurityNumber)
    		{
    			System.out.println("\n------Resident Found-------\n");
    			//System.out.println(list.get(i));
    			String name=list.get(i).getName();
    			int id=list.get(i).getSocialSecurityNumber();
    			char gender=list.get(i).getGender();
    			r=new Resident(name,id,gender);
    			break;
    		}
    		else
    		{
    			try {
    				throw new ResidentNotFoundException(" Resident Not Found");
    			}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    		}
    	}
    	return r;
       

    }

   // Sort the name of the residents in alphabetical order.

    public List<Resident> getAllNamesSorted(List <Resident> residentsRepository)
    {
    	residentsRepository.sort((Resident r1,Resident r2)->r1.getName().compareTo(r2.getName()));
    	
    	
    	residentsRepository.forEach(s->System.out.println(s));

        return residentsRepository;

    }

   // Fetch the list of residents based on their gender.
   
	public void getAllResidentsByGender(List<Resident> list, char gender) 
	{
		
		list.stream().filter(s->s.getGender()==gender).forEach(s->System.out.println(s));
		
		
	}

}
