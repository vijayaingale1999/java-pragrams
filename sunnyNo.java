import java.util.Scanner;
import java.lang.Math;
public class sunnyNo{
    //Sunny no is a no in which no+1 is perfect square 
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no");
        int i = s.nextInt();
        int n=i+1;
        double squrt = Math.sqrt(n);
        n=(int)squrt;
        if(n==squrt)
        {
            System.out.println("The given no is sunny");
        }
        else{
            System.out.println("the no is no sunny");
        }
    }
    
}
