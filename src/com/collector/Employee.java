/*  Exercise for Collector functions 
 
 
   Observe class below 
   
     public class Employee 
      { 
         private String firstName ;
         private String lastName;
         private Department department;
         private Designation designation ;
       } 
       
       
       public class Department 
        { 
          private String departmentName;
          private String location ;
         } 
         
         public class Designation 
          { 
            private String designation_type;
           } 
         
         
         
         #create instances of Employee and store in a list 
         
         #filter the list based on criteria where department="Sales" and designation="Manager"  and collect result into seperate list 
         #filter the list based on criteria where department location is Mumbai and collect result into seperate list 
         #display the with employee first and last name combined using a mapping operation and collect result in separate list 
         */

package com.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String firstName ;
    private String lastName;
    private Department department;
    private Designation designation ;
	public Employee(String firstName, String lastName, Department department, Designation designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
	}
	public Employee() {
		
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public static void main(String[] args) {
		
        List<Employee> list = new ArrayList<>();
        
        list.add(new Employee("Jenny","J",new Department("Sales","Mumbai"),new Designation("Manager")));
        list.add(new Employee("James","James",new Department("Finance","Delhi"),new Designation("Officer")));
        list.add(new Employee("Samuel","M",new Department("Accounts","Mangalore"),new Designation("Deputy Manager")));
        list.add(new Employee("Peter","Johns",new Department("Sales","Mysore"),new Designation("Consultant")));
        
        List<Employee> salesManagers = list.stream().filter(employee -> "Sales".equals(employee.getDepartment().getDepartmentName()) &&"Manager".equals(employee.getDesignation().getDesignation_type())).collect(Collectors.toList());
        System.out.println("Sales Managers:");
        salesManagers.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));
        
        
        List<Employee> mumbaiEmployees = list.stream().filter(employee -> "Mumbai".equals(employee.getDepartment().getLocation())).collect(Collectors.toList());
        System.out.println("\nMumbai Employees:");
        mumbaiEmployees.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));
        
        List<String> combinedNames = list.stream().map(employee -> employee.getFirstName() + " " + employee.getLastName()).collect(Collectors.toList());
        System.out.println("\nCombined Names:");
        combinedNames.forEach(System.out::println);
	}

}