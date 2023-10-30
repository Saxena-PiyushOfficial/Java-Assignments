package Customer_utils;

import java.util.Comparator;

import com.app.core.Customer;

public class Customer_DOBRegAmount implements Comparator<Customer> {
  
	@Override
	public int compare(Customer c1,Customer c2)
	{
		int r =c1.getDob().compareTo(c2.getDob());
		if(r==0)
		{
			if(c1.getRegistrationAmount() < c2.getRegistrationAmount())
			{
				return -1;
			}
		}
		return r;
	}
}
