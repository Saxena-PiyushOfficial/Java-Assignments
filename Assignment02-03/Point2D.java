import java.lang.Math;
import java.util.Scanner;
class Point2D
{
   private double x;
   private double y;
   
   Point2D(double x,double y)
   {
     this.x=x;
	 this.y=y;
   }
     public String show(){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x-coordinate:");
		x=sc.nextDouble();
		System.out.println("Enter the y-coordinate:");
		y=sc.nextDouble();
		
		return "Displayed=> x: "+x+" y: "+y;
   
   }
   boolean isEqual(Point2D obj)
   {
     if(x==obj.x)
	 {
	    if(y==obj.y)
		return true;
	   else
		   return false;
	 }
	 else
	 return false;
	 
   }
   double calculateDistance(Point2D obj)
   {
      return Math.sqrt((obj.y - this.y) * (obj.y - this.y) + (obj.x - this.x) * (obj.x - this.x));
   }
   
}