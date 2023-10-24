
class TestPoint
{
  public static void main(String [] arg)
  {
	 
      Point2D p1=new Point2D(34.34,78.67);
	  Point2D p2=new Point2D(33.34,78.67);
	  
	  
	  
	 System.out.println(p1.show());
	  System.out.println(p2.show());
	  
	  boolean b1=p1.isEqual(p2);
	  if(b1==true)
		  System.out.println("Same");
	  else{
		  System.out.println("Different");
		  double distance=p1.calculateDistance(p2);
		  System.out.println(distance);
	  }
   }
	  

	  
	  
	  
  
  }
