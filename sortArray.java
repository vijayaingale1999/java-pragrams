public class sortArray {
    //program to sort array in assending order
    public static void main(String[] args)
    {
    int[] a={23,45,61,24,89};
    for(int i=0;i<a.length;i++)
    {
       for(int j=i+1;j<a.length;j++)
       {
        if(a[i]>a[j])
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
       }
    }
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
  }
}
