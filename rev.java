import java.util.Scanner;

public class rev {
      //to find the revers no
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no");
        int i= s.nextInt();
        int j=i,a=0;
        while(j!=0)
        {
            int rem=j%10;
             a=(a*10)+(rem);
              j=j/10;
        }
        
            System.out.println("reverse no is"+ a);
        

        
    }
    
}
