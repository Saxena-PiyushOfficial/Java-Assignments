package Validation;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import Customexe.LicenceExpiryException;
import Customexe.SpeedOutOfRangeException;

public class ValidationRule {
public static final int MAX_SPEED;
public static final int MIN_SPEED;


 static {
	 MAX_SPEED=100;
	 MIN_SPEED=40;
   
 }
 public static void validatespeed(int speed) throws SpeedOutOfRangeException
 {
	 if(speed > MAX_SPEED)
		 throw new SpeedOutOfRangeException("Slow your speed India");
	 else if(speed <MIN_SPEED)
		 throw new SpeedOutOfRangeException("Increase your speed");
	 else
		 System.out.println("You are in Range ");
 }
 public static void CheckingLicence(String d1) throws LicenceExpiryException,DateTimeParseException
 {
	LocalDate d=LocalDate.of(2018,12,27);
	 if(d.isBefore(LocalDate.parse(d1)))
		 throw new LicenceExpiryException("Licence Expired!!!!! GIVE ME BRIBE");
	 else
		 System.out.println("Licence valid!!!!You can go ahead");
 }
 
 
 
 
 
 
 
 
}
