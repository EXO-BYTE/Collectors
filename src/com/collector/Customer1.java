
package com.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Customer1 {
	
	private int customer_id;
    private Product product;
    private float amount_paid;
    private float payment_type;
    private String location;
    
    
	public Customer1() {
		super();
	}
	public Customer1(int customer_id, Product product, float amount_paid, float payment_type, String location) {
		super();
		this.customer_id = customer_id;
		this.product = product;
		this.amount_paid = amount_paid;
		this.payment_type = payment_type;
		this.location = location;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public float getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(float amount_paid) {
		this.amount_paid = amount_paid;
	}
	public float getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(float payment_type) {
		this.payment_type = payment_type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    
public static void main(String[] args) {
		
		List<Customer1> list = new ArrayList<>();
		list.add(new Customer1(1,new Product("Milk",50,10,false,"Starbucks"),1500,35 ,"Mysore"));
		list.add(new Customer1(2,new Product("Tea",45,4,true,"starbucks"),24,34,"Chennai"));
		list.add(new Customer1(3,new Product("Coffee",45,4,false,"starbucks"),24,34,"Banglore"));
        l
		
		
        Map<String, List<Customer1>> customersByLocation = list.stream().collect(Collectors.groupingBy(Customer1::getLocation));
		System.out.println("List of customers as per location: " + customersByLocation);
	    //Map<String, List<Customer1>> customersByProduct = list.stream().collect(Collectors.groupingBy(Product::getProductName));
		//System.out.println("List of customers as per product: " + customersByProduct);
		Map<Float, List<Customer1>> customersByPaymentType = list.stream().collect(Collectors.groupingBy(Customer1::getPayment_type));
		 System.out.println("List of customers as per payment type: " + customersByPaymentType);
		double averageAmount = list.stream()
		        .mapToDouble(Customer1::getAmount_paid)
		        .average()
		        .orElse(0.0);
		
		System.out.println("Average amount_paid by customer: " + averageAmount);
		//Map<String, Double> sumByProduct = list.stream().collect(Collectors.groupingBy(Customer1::getProduct, Collectors.summingLong(Customer1::getAmount_Paid)));
		
		}
}
