package ArrayReferences;
import java.lang.Math;


public class Point2D {
	 private double x;
	   private double y;
	   
	   public Point2D(double x,double y)
	   {
	     this.x=x;
		 this.y=y;
	   }
	     public String show(){
	       
			return "Displayed=> x: "+x+" y: "+y;
	   
	   }
	  public boolean isEqual(Point2D obj)
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
	  public double calculateDistance(Point2D obj)
	   {
	      return Math.sqrt((obj.y - this.y) * (obj.y - this.y) + (obj.x - this.x) * (obj.x - this.x));
	   }
}
