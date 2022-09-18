import java.util.Scanner;
import java.lang.*;

public class Palindrom{
     //to check given no is palindrom or not
   public static void main(String[] args)
   { 
       int j,n,a=0,rem;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the num:");
       int i=s.nextInt();
       j=i;//123
       while(j!=0)
       {
          rem=j%10;//3 ,
          System.out.println("rem="+rem);
          a=rem+(a*10);
          System.out.println("new num="+a);
          j=j/10;
          System.out.println("new ass="+j);
       }

       if(a==i)
       {
           System.out.println("the no is palindrom");
       }
   }
}
