public class smallElementArray {
    //program to print smallest element of an array
    public static void main(String[] args)
    {
    int[] a={ 10 ,2,45,1,67,89,3};
    int min=a[0];
    for(int i=0;i<a.length;i++)
    {
       if(a[i]<min)
       {
        min=a[i];
       }
    }
    System.out.println("the smallest element is" + " "+min);
   }
}
