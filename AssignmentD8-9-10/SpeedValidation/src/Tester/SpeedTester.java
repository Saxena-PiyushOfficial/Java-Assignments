package Tester;

import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.text.ParseException;
import Customexe.*;
import Validation.ValidationRule;

import static Validation.ValidationRule.*;
public class SpeedTester {
	public static void main(String[] args)   {
	
		Scanner sc=new Scanner(System.in);
		try
	{
		System.out.println("Enter your Current Speed");
		validatespeed(sc.nextInt());
	}
	catch(SpeedOutOfRangeException e) {
	//System.out.println(e.getMessage());
		//e.printStackTrace();
		System.out.println(e);
	}
	try
	{
		
		System.out.println("Enter your Licence Expiry Date");
		CheckingLicence(sc.next());
	} catch (DateTimeParseException e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	} catch (LicenceExpiryException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	 
	}
	
  }

