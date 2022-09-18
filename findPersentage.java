import java.util.*;
public class findPersentage {
    //proram to find persentage by accepting total marks and getting marks from user
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the marks");
    int x= sc.nextInt();
    System.out.println("Enter the total");
    int total= sc.nextInt();
    float persentage = x*100/total;
    System.out.println("The persentage is"+ persentage);
    }
} 