import java.util.Scanner;
class CalApp
{
    double a;
	double b;
  Scanner sc=new Scanner(System.in);
  CalApp(double a,double b)
  {
    this.a=a;
	this.b=b;
  }
   double add()
   {
     double z;
	 z=sc.nextInt()+sc.nextInt();
	 return z;
   }
    double sub()
   {
     double z;
	 z=sc.nextInt()-sc.nextInt();
	 return z;
   }
    double multiply()
   {
     double z;
	 z=sc.nextInt()*sc.nextInt();
	 return z;
   }
    double divide()
   {
     double z;
	 z=sc.nextInt()/sc.nextInt();
	 return z;
   }
}