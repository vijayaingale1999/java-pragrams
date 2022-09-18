import java.util.Scanner;

public class automorphicno {
      //automorphic no is a no whose square has the same digits in the end as the no itself
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no");
        int i=s.nextInt();
        int j=i,count=0,a=0,rem,num=0;

        while(j!=0)
        {
           count++;
           rem=j%10;
           num=(num*10)+rem;
           j= j/10;
        }
        System.out.println(count);
        System.out.println(num);

        int square =i*i;
        System.out.println("Square:"+square);
        for(int m=0;m<count;m++)
        {
            j=square%10;
            a=a*10+j;
            square=square/10;
        }
        System.out.println(a);

      if(a==num)
      {
          System.out.println("The no is automorphic");
      }
    }
}
