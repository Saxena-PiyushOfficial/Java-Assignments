import java.util.Scanner;

class CalTest
{
  public static void main(String[] arg)
  {
    int op;
	Scanner sc=new Scanner(System.in);
     CalApp c1=new CalApp(10,20);
	 
	 do{
		 System.out.println("---------------1.Add------------------");
		 System.out.println("---------------2.Sub------------------");
		 System.out.println("---------------3.Multiply------------------");
		 System.out.println("---------------4.Divide------------------");
		 System.out.println("---------------0.Exit------------------");
		 System.out.println("Enter the choice:");
	     op=sc.nextInt();
	    switch(op)
		{
		case 1:System.out.println("Enter the two numbers:");
		       System.out.println("Addition is: "+c1.add());
			   break;
		case 2:System.out.println("Enter the two numbers:");
		System.out.println("Subtraction is: "+c1.sub());
			   break;
		case 3:System.out.println("Enter the two numbers:");
		System.out.println("Multiplication is: "+c1.multiply());
			   break;
		case 4:System.out.println("Enter the two numbers:");
		System.out.println("Division is: "+c1.divide());
			   break;
		case 0:System.out.println("---------Thank you for using Calculator");
		System.exit(0);
		default: System.out.println("Invalid option....Try Again---------");
		}
	 
	 }while(op!=0);
	 
  
  }
 
}