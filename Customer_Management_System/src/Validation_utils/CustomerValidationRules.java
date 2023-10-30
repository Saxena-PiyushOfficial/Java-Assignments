package Validation_utils;

import java.security.Provider.Service;
import java.time.LocalDate;
import java.util.List;


import com.app.core.Customer;
import com.app.core.ServicePlan;

public class CustomerValidationRules {

	
	public static void checkForEmail(String NewEmail,List<Customer> cust) throws Customer_Exception_Handler
	{
		Customer newCustomer=new Customer(NewEmail); 
		if(cust.contains(newCustomer)) 
			throw new Customer_Exception_Handler("Email id already exists");
		System.out.println("No Duplicates, Done Sign up!!!!!! ");
	}
	public static ServicePlan validatePlans(String plan) throws IllegalArgumentException
	{
		return ServicePlan.valueOf(plan.touppercas);
	}
	
	
	public static Boolean checkForServicePlans(ServicePlan cplan, double regAmt) throws IllegalArgumentException,Customer_Exception_Handler
	{
		return  (cplan.getServiceCharges()==regAmt)?Boolean.TRUE:Boolean.FALSE; 
		
	}
	 
	public static Customer validateAllInputs(String firstName,String lastName, String email,String password,double registrationAmount,String dob,String Cplan,List<Customer> customer) throws Customer_Exception_Handler,IllegalArgumentException
	{
		checkForEmail(email, customer);
		ServicePlan myplan=validatePlans(Cplan.toUpperCase());
		boolean bb=CustomerValidationRules.checkForServicePlans(myplan,registrationAmount);
		if(bb=true)
		System.out.println("Valid Service Plan");
		else
			throw new Customer_Exception_Handler("Invalid Service Plan");
		
		return new Customer(firstName,lastName,email,password,registrationAmount,LocalDate.parse(dob),myplan);
	}
}
