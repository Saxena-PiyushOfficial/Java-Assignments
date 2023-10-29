package Tester;
import UsedStacks.*;
import Interface.*;
import java.util.Scanner;
public class CustomerTester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
		Stack stack=null;
		int op;
			System.out.println("-------Select Stack-----");
			System.out.println("1.Fixed Stack");
			System.out.println("2.Growable Stack");
			op=sc.nextInt();
			switch(op)
			{
			case 1:   stack =new FixedStack();
			break;
			case 2:
				 stack=new GrowableStack();
					break;
			default:  System.out.println("Invalid Option choosed!!!!Select valid option");	
			          System.exit(0);
			}
			
     do
     {
    	 System.out.println("\n-------Menu-----");
			System.out.println("3.Push Data");
			System.out.println("4.Pop Data");
			switch(sc.nextInt())
			{
			case 3:
				if(stack instanceof FixedStack) {
				System.out.println("Enter the id name and address:");
				stack.push(new Customer(sc.nextInt(),sc.next(),sc.next()));
				stack.toString();
				 break;
				}
				else {
					System.out.println("Enter the id name and address:");
				stack.push(new Customer(sc.nextInt(),sc.nextLine(),sc.nextLine()));
				stack.toString();
				break;
				}
			case 4:
				if(stack instanceof FixedStack) {
					stack.pop();
					stack.toString();
					
					 break;
					}
					else {
						stack.pop();
					stack.toString();
					break;
					}

				
			
			case 0:
				System.exit(0);
			}
     }while(true);
	} catch (UnderflowException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}