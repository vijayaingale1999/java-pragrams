import java.util.*;
public class Sum {
    public static void main(String[] args)
    {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the first no");
         int a=sc.nextInt();
         System.out.println("Enter the second no");
         int b = sc.nextInt();
         System.out.println("Enter your choice /n 1.ADD /n2.SUB /n3.DIV /n4.MULTIPLY");
         int n=sc.nextInt();
         switch(n)
         {
           
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a/b);
            break;
            case 4: System.out.println(a*b);
            break;
            case 5: System.exit(0);
            default : System.out.println("Your enter no is wrong");  
         }
        


    }
    
}
