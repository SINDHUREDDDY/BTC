package com.btc.pkg1;

public class Customer 
{
	 public Customer() {
	        //default Constructor
	    }
	 int customerId;
	 String name;
	 String email;
	 Address address;

	    @Override
	    public boolean equals(Object other) 
	    {	 
			Boolean res=false;
			if(other==this)
			{
				res=true;
			}
			if(!(other instanceof Customer))
			{
				res=false;				}
				Customer c=(Customer) other;
				
		        return name.equals(c.name)&& email.equals(c.email);
		    }
	    public Customer(int customerId, String name, String email, Address address) 
	    {
			super();
			this.customerId = customerId;
			this.name = name;
			this.email = email;
			this.address = address;
		}
		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}

	    
}
