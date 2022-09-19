public class printDuplicateArray {
    //program to print duplicate element of an array
    public static void main(String[] args)
    {
        int[] a={10,20,40,30,40,50,30,20};
        //to check duplicate element of array
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
               {
                if(a[i]==a[j])
                System.out.println(a[i]);
               }
        }
    }
}
