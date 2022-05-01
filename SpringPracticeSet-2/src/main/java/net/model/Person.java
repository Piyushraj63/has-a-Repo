package net.model;

public class Person {
   private String name;
   private String email;
   private Address address;
   
   
   
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
	
	
		public Person() {
		  super();
	    }
	
	
		public Person(String name, String email, Address address) {
			super();
			this.name = name;
			this.email = email;
			this.address = address;
		}
	
	
		@Override
		public String toString() {
			return "Person [name=" + name + ", email=" + email + ", address=" + address + "]";
		}
		
		public void  myInit() { System.out.println("Method is created"); }
		   
   
}
