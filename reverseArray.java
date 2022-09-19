public class reverseArray {
    //program to print array in reverse order
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50,78,34};
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i] +" ");
        }
    }
}
