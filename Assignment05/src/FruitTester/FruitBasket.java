package FruitTester;
import com.app.fruits.*;
import java.util.Scanner;
public class FruitBasket {

	public static void main(String[] args) {
		int op; 
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of fruits to buy:");
		Fruit [] fruits=new Fruit[sc.nextInt()];
		do {
			System.out.println("1.Add Mango");
			System.out.println("2.Add Apple");
			System.out.println("3.Add Orange");
			System.out.println("4.Display Name of all Fruits");
			System.out.println("5.Display name,color,weight, taste of all fresh fruits ,in the basket");
			System.out.println("0.Exit");
			System.out.println("Enter the choice:");
			op=sc.nextInt();
			switch(op)
			{
			case 2: 
				if (count < fruits.length) {
				fruits[count++]=new Apple(sc.next(),sc.nextDouble(),sc.next());
				System.out.println("Apple added to the basket................");
				}
				else
					System.out.println("FruitBasket Full!!!!!");
					
				break;
			case 1: 
				if(count<fruits.length) {
				fruits[count++]=new Mango(sc.next(),sc.nextDouble(),sc.next());
				System.out.println(" Mango added to the basket................");	
				}else
					System.out.println("FruitBasket Full!!!!!");
				break;
			case 3: 
				if(count<fruits.length) {
				fruits[count++]=new Orange(sc.next(),sc.nextDouble(),sc.next());
				System.out.println(" Orange added to the basket................");	
				}else
					System.out.println("FruitBasket Full!!!!!");
				break;
			case 4:
				System.out.println("Display Name of all Fruits");
				for (Fruit f : fruits)
					if (f != null)
						System.out.println(f.getName());
				break;
			case 5:
				System.out.println("Displaying name,color,weight, taste of all fresh fruits ,in the basket");
				for (Fruit f : fruits)
					if (f != null)
						System.out.println(f);
				break;
			case 0:System.out.println("Exiting!!!!!!!!!!Byeeeeeeee");
			   System.exit(0);
			 default: System.out.println("Invalid choice selected....");
			}
			}while(op!=0);
		sc.close();
		}
	}


