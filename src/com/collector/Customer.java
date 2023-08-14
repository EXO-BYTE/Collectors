/*observe class below
 
 public class Customer 
  { 
      private String firstName;  
      private String lastName;
      private String emailId;
      private Location location;
      
   }
   
   public class Location 
    { 
     private String locationName;
     private String state;
     }  
 
 
 #Create the object of customer class  and store in list 
 #use stream to get the list of customer first ,lastname and location as list of seperate strings*/

package com.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
    private String firstName;
    private String lastName;
    private String emailId;
    private Location location;

    public Customer() {
		
	}
    
	public Customer(String firstName, String lastName, String emailId, Location location) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.location = location;
	}

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
	}



	public static void main(String[] args) {
		
        List<Customer> customerList = new ArrayList<>();
        
        
        Customer customer1 = new Customer("John", "John", "john@g.com", new Location("City1", "State1"));
        Customer customer2 = new Customer("Jenny", "S", "jane@g.com", new Location("City2", "State2"));
        Customer customer3 = new Customer("James", "J", "bob@eg.com", new Location("City3", "State3"));
        
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        
        List<String> firstNames = customerList.stream()
            .map(Customer::getFirstName)
            .collect(Collectors.toList());
            
        List<String> lastNames = customerList.stream()
            .map(Customer::getLastName)
            .collect(Collectors.toList());
            
        List<String> locations = customerList.stream()
            .map(e -> e.getLocation().getLocationName())
            .collect(Collectors.toList());
            
        System.out.println("First Names: " + firstNames);
        System.out.println("Last Names: " + lastNames);
        System.out.println("Locations: " + locations);
    }
}


