import java.util.Scanner;
import java.lang.Math;
public class techNo {
    //a no is said to be tech is the no of digits in a given no is even and the no can be spilt from middle
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int i = s.nextInt();
        int j=i,count=0;
        while(j!=0)
        {
            count++;
            j=j/10;
        }
        if(count%2==0)
        {
            int firsthalf,secondhalf;
            firsthalf =i%(int)Math.pow(10,count/2);
            secondhalf=i/(int)Math.pow(10,count/2);
            int n= secondhalf+firsthalf;
            int Square= n*n;
             if(Square==i)
             {
                 System.out.println("the given no is tech no");
             }
             else
             {
            System.out.println("the no is not tech no");
             }
         }
         else
         {
             System.out.println("the give no is not even");
         }
    }
}
