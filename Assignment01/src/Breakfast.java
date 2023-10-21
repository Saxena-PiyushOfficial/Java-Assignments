package com.cdac.tester;
package com.cdac.core;
import java.util.Scanner;
class Breakfast
{
        static int count=0;
		
 public static void main(String []args)
{
   int op;
   int quant;
   int price;
   Scanner sc=new Scanner(System.in);
   do{
        System.out.println("------Menu-----");
        System.out.println("1.idli");
        System.out.println("2.dosa");
        System.out.println("3.samosa");
        System.out.println("4.poha");
        System.out.println("5.kachori");
        System.out.println("6.khamand");
        System.out.println("7.cream roll");
        System.out.println("8.maggi");
        System.out.println("9.cake");
        System.out.println("10.Generate Bill");
        System.out.println("Enter the choice:");
      op=sc.nextInt();
      switch(op)
	{
           case 1:
                  System.out.println("Enter the quantity of idli");
                  quant=sc.nextInt();
				  price+=quant*20;
                  count+=quant;
                  System.out.println("--------------------------------------------------idli Quantity: "+quant);
                  break;
           case 2:
                  System.out.println("Enter the quantity of Dosa");
                  quant=sc.nextInt();
				  price+=quant*25;
                   count+=quant;
                  System.out.println("--------------------------------------------------Dosa Quantity: "+quant);
                  break;
           case 3:
                   System.out.println("Enter the quantity of Samosa");
                  quant=sc.nextInt();
				  price+=quant*10;
                   count+=quant;
                  System.out.println("--------------------------------------------------Samosa Quantity: "+quant);
                    break;
            case 4:
                  System.out.println("Enter the quantity of Poha");
                  quant=sc.nextInt();
				  price+=quant*20;
                   count+=quant;
                  System.out.println("--------------------------------------------------Poha Quantity: "+quant);
                     break;
             case 5:
                   System.out.println("Enter the quantity of Kachori");
                  quant=sc.nextInt();
				  price+=quant*10;
                   count+=quant;
                  System.out.println("--------------------------------------------------Kachori Quantity: "+quant);
                    break;
             case 6:
                   System.out.println("Enter the quantity of Khamand");
                  quant=sc.nextInt();
				  price+=quant*15;
                   count+=quant;
                  System.out.println("--------------------------------------------------Khamand Quantity: "+quant);
                     break;
             case 7:
                   System.out.println("Enter the quantity of Cream Roll");
                  quant=sc.nextInt();
				  price+=quant*10;
                   count+=quant;
                  System.out.println("--------------------------------------------------Cream Roll Quantity: "+quant);
                      break;
              case 8:
                   System.out.println("Enter the quantity of Maggi");
                  quant=sc.nextInt();
				  price+=quant*20;
                   count+=quant;
                  System.out.println("--------------------------------------------------Maggi Quantity: "+quant);

                      break;
              case 9:
                   System.out.println("Enter the quantity of cake");
                  quant=sc.nextInt();
				  price+=quant*15;
                   count+=quant;
                  System.out.println("--------------------------------------------------Cake Quantity: "+quant);
                       break; 
               case 10:
                  System.out.println("Generate Bill");
                  System.out.println("--------------------------------------------------Total Quantity: "+count+" and Total price is: "+price);
				  

                  System.out.println("---------------------Thank You,Bye-------------- ");
                  System.exit(0);
                  
             default:
                     System.out.println("--------------------------------------------------Invalid Input");
         }

    }while(op!=0);
    sc.close();
}


}