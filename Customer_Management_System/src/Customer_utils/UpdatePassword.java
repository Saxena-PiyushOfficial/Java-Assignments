package Customer_utils;

import java.util.List;

import com.app.core.Customer;

import Validation_utils.Customer_Exception_Handler;

public class UpdatePassword {

	public static void validatePassword(String email,String oldPaswd,String newpaswrd, List<Customer> customer) throws Customer_Exception_Handler,NullPointerException
	{
		Customer cust = null;
	      
	        for(Customer c: customer)
	        {
	        	if(c.getEmail().equals(email) &&  c.getPassword().equals(oldPaswd))
	        	    cust =c;
	        	break;
	        }
	        
	        if(cust !=null) {
	        	cust.setPassword(newpaswrd);
	        }
	        	
		
	}
	
}
