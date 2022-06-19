package com.btc.pkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MobileStore 
{
	
	


    public MobileStore()
    {
    	

    }
    public List<Mobile> addValues()
    {
    	List<Mobile> list=new ArrayList<Mobile>();
    	Mobile m1=new Mobile("Samsung", "Samsung M55", 46000,"6.7inches", "5000mAh", "128GB RAM", 32);
		Mobile m2=new Mobile("Samsung", "Samsung M33", 20000,"5.7inches", "3000mAh", "64GB RAM", 12);
		Mobile m3=new Mobile("Apple", "iphone 13", 79000,"6.1inches", "3000mAh", "128GB ", 12);
		Mobile m4=new Mobile("Apple", "iphone SE", 32000,"4.7inches", "1821mAh", "64GB ", 7);
		Mobile m5=new Mobile("Vivo", "Vivo Y75", 21000,"6.44inches", "4050mAh", "128GB ", 7);
		Mobile m6=new Mobile("Oneplus", "OnePlus 10R", 40000,"6.7inches", "5000mAh", "128GB ", 16);
		
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
    	return list;
    }
   
    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
    	List<Mobile> lists=addValues();
		 lists= lists.stream().filter( s ->  s.getBrandName().equalsIgnoreCase(brandName)).collect(Collectors.toList());
    	//System.out.println(lists);
		return lists;
    	
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {
    	List<Mobile> lists1=addValues();
		 lists1=lists1.stream().filter(s -> s.getCost()>=39000).collect(Collectors.toList());

      return lists1;
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
    	List<Mobile> lists=addValues();
		lists=lists.stream().filter(s -> s.getCameraPixels()>=12).collect(Collectors.toList());
    	
        return lists;
    }





	


}


