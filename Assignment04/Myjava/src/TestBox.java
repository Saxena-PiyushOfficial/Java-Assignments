package Day4;

import java.util.Scanner;

public class TestBox {
	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		Box[] boxes=new Box[sc.nextInt()];
		
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter the dimensions");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
      for(Box b:boxes)
      {
    	  System.out.println(b.getBoxDetails()+" ");
      }
      for(Box b:boxes)
      {
    	  System.out.println("Volume is"+b.getBoxVol());
      }
      for(int i=0;i<boxes.length;i++)
      {
    	  double d=boxes[i].getBoxVol();
    			  if(d>100)
    			  {
    				  boxes[i].setWidth();
    				  System.out.println("width: "+ boxes[i].getWidth());
    			  }
      }
    			  System.out.println("Updated volumes");
    			  for(Box b:boxes)
    			  {
    				  System.out.println(b.getBoxVol()+" ");
    			  }
      }
    
    
}
