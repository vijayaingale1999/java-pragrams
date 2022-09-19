public class thirdLargestElement {
    //java program to find  3rd largest element of an array
    public static void main(String[] args)
    {
        int[] a={20,4,50,5,67,10};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The largest element is"+" "+a[0]);
        System.out.println("The 2nd largest element is"+" "+a[1]);
        System.out.println("Third largest element is"+" "+a[2]);
        System.out.println("The smallest element is"+" "+a[a.length-1]);
    } 
}
