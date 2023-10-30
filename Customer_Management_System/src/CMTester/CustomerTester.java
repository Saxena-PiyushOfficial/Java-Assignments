package CMTester;

import static Customer_utils.UpdatePassword.validatePassword;
import static Validation_utils.CustomerValidationRules.validateAllInputs;
import static Customer_utils.SignInCustomer.checkSignInPassword;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;

import Validation_utils.Customer_Exception_Handler;

/*Customer management system
Supply Options
1. Sign up (customer registration)
2. Sign in (login)
i/p : email n password
3. Change password
i/p : email n old password n new password
4. Un subscribe customer
i/p : customer email

5. Display all customers.
0. Exit */

public class CustomerTester {

	public static void main(String[] args)  {
		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> customer=new ArrayList<>();
			do {
				System.out.println("------------------------------Customer Management System--------------------------");
				System.out.println("Options : 1 . Sign Up");
				System.out.println("Options : 2.Sign in ");
				System.out.println("Options : 3.  Change password \n");
				System.out.println("Options : 4. Un subscribe customer\r\n");
				System.out.println("Options : 5.Display all");
				System.out.println("Options : 6.Sort the list according to email");
				System.out.println("Options : 7.Sort the list according to acc. to dob and registraton Amount");
				System.out.println("Options : 0.Exit");
				System.out.println("Choose an option");
				try {	
							switch(sc.nextInt())
							{
						
							case 1:System.out.println("Enter your FirstName, LastName ,Email Id ,Password, registrationAmount, dob, ServicePlan\n");
							          Customer newcust=validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),customer);  
							           customer.add(newcust);
								break;
							case 2:
								System.out.println("Enter your Email Id and Password");
								checkSignInPassword(sc.next(),sc.next(),customer);
								
								
						
								break;
							case 3:
								 System.out.println("Enter your email ,old Password and new Password");
								 validatePassword(sc.next(), sc.next(),sc.next(),customer);
								 
								break;
							case 4:
								System.out.println("Enter emailid details for Unsubscribe");
								Customer cust = new Customer(sc.next());
								boolean removed = customer.remove(cust);
								
								if (!removed)
									throw new Customer_Exception_Handler("Your details are removed!!!!!!byee");
											
								System.out.println("You are Unsubscibed !");
								break;
							case 5:for(Customer c:customer) 
									  System.out.println(c);
							     break;
							case 6:
								Collections.sort(customer);
								System.out.println("Sorted List");
								for(Customer c: customer)
								{
									System.out.println(c);
								}
							    break;
							case 7:
								Collections.sort(customer);
								System.out.println("Sort according to dob and reg Amount ");
								for(Customer c: customer)
								{
									System.out.println(c);
								}
								break;
							case 0:System.exit(0);
							}		
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}while(true);
		}

	}

}


