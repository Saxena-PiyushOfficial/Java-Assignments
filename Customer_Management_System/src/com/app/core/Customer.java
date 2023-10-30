package com.app.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {

	private static int ID=200;
 
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		

	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public ServicePlan getPlan() {
		return plan;
	}



	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}


	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public Customer(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer details:customerId"+customerId + " first_Name=" + firstName + ", last_Name=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan;
	}



	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Customer) {
			Customer anotherCustomer = (Customer) obj;
			return this.email.equals(anotherCustomer.email);
		}
		return false;

	}
	@Override
	public int compareTo(Customer anotherCustomer)
	{
		return this.email.compareTo(anotherCustomer.email);
	}
}
