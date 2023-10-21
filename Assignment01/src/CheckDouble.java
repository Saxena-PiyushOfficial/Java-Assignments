import java.util.Scanner;
class CheckDouble{
    public static void main (String [] args)
    {
        double avg;
        double sum=0;
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
          for(int i=0;i<2;i++){
        if(sc.hasNextDouble())
        {
               double d=sc.nextDouble();
               sum+=d;
               
        }
        else
        {
                 System.out.println("Error occured Terminated ");
                 System.exit(0);
        }
          }
          avg=sum/2;
        System.out.println("Average is: "+avg);
    }
}