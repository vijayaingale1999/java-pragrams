package Array;
//to copy element of one array into another

public class duplicatearray
{
  // to create duplicate of an array
    public static void main(String[] args) {
        {
    }
    
    int[] x= {10,20,30,40};
    int[] y = new int[x.length];
      int i;
      for(i=0;i<(x.length);i++)
      {
           y[i]= x[i];
      }
       i=0;
      while(i<x.length)
      {
         System.out.println(y[i]);
         i++; 
      }
    }
}
