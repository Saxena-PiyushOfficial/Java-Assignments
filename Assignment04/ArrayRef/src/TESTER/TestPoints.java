package TESTER;
import ArrayReferences.Point2D;

import java.util.Scanner;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 //System.out.println("Enter the number of points to store:");
//      Point2D [] t=new Point2D[sc.nextInt()];
//      for(int i=0;i<t.length;i++)
//      {
//    	  System.out.println("Enter the dimension of x and y:");
//    	  double x=sc.nextDouble();
//    	  double y=sc.nextDouble();
//    	  t[i]=new Point2D(x,y); 
//      }
//      for(Point2D p:t)
//    	  System.out.println(p.show());
//      t=null;
      Point2D [] t1=new Point2D[sc.nextInt()];
      for(int i=0;i<2;i++)
      {
    	  System.out.println("Enter the dimension of x and y:");
    	  t1[i]=new Point2D(sc.nextDouble(),sc.nextDouble()); 
      }
      System.out.println("Checking IsEqual or not:");
      System.out.println(t1[0].isEqual(t1[1]));
      System.out.println("Calculating distance:");
      System.out.println(t1[0].calculateDistance(t1[1]));
     
      sc.close();
	}

}
