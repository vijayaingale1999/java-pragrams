import java.util.Scanner;

public class peterson {
    //pterson = sum of factorial of each digit is equal to number
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the nop");
      int i=s.nextInt();
      int j=i,a=0,sum=0;
      while(j!=0)
      {
          int rem = j%10;
            int n=1;
          for(int b=1;b<=rem;b++)
          {
              n*=b;
          }
         sum=sum+n;
         j=j/10;
      }
      if(sum==i)
      {
          System.out.println("the no is peterson");
      }
      else{
       System.out.println("Given no is not peterson no");
    }
}
}
