package Customer_utils;

import java.util.List;

import com.app.core.Customer;

import Validation_utils.Customer_Exception_Handler;

public class SignInCustomer {
	public static Customer SignIn(String email,String password,List<Customer> customer)throws Customer_Exception_Handler
	{
		Customer cust=new Customer(email);
		int index=customer.indexOf(cust);
		if(index==-1)
			throw new Customer_Exception_Handler("email not found!!!!!Please Sign up");
		else
			return customer.get(index);
	}
	
	public static void checkSignInPassword(String email,String password,List<Customer> cust) throws Customer_Exception_Handler
	{
		Customer customer=SignIn(email,password,cust);
		if(customer.getPassword().equals(password))
		{
			System.out.println("Welcome to the Customer APP");
		}
		else
			throw new Customer_Exception_Handler("Password wrong !!!Try with correct Password");
		
	}

}
