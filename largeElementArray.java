public class largeElementArray {
    //java program to print largest element of an array
    public static void main(String[] args)
    {
       int[] a={30,45,20,10,67,29};
       int max=a[0];
       //to find largest element of an array
       for(int i=0;i<a.length;i++)
       {
        if(a[i]>max)
        {
            max=a[i];
        }
       }
       System.out.println("the maximumn no is "+ " "+max);
    }
}
