package com.btc.pkg1;

public class Main {

	public static void main(String[] args) 
	{
		
		Item i1=new Item(12,"Book",522.2);
		Item i2=new Item(5,"Box",20);
		Item i3=new Item(52,"Dress",999);
		Item [] i=new Item[5];
		i[0]=i1;
		i[1]=i2;
		i[2]=i3;
		double exp=i[0].getPrice();
		String name=i[0].getName();
		for(int j=0;j<=i.length-1;j++)
		{
			if(i[j]==null)
			{
				break;
			}
			else
			{
				System.out.println(i[j]);
				
				for(int k=0;k<i.length;k++)
				{
					for(int l=k+1;l<i.length;l++)
					{
						if(i[l]==null)
						{
							break;
						}
						else if(i[k].getPrice()<i[l].getPrice())
						{
							exp=i[l].getPrice();
							name=i[l].getName();
							break;
						}
					}	
				}	
			}		
		}
		System.out.println("Expensive item is "+name);
		
	}
}
