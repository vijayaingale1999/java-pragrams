import javax.sound.sampled.SourceDataLine;

public class rotateArray {
    //ptogram to rotat element of an array
    public static void main(String[] args)
    {
    int[] a={10,20,30,40,50};
    int first;
    first=a[0];//we save first element of an array
   for(int i=0;i<a.length-1;i++)
    {
        a[i]=a[i+1];  //to shift the element by one
    }
    a[a.length-1]=first; //adding first element to last position
    for(int i=0;i<a.length;i++)
    {
        //printing element of an array
        System.out.println(" "+a[i]);
    }
    
    }
}
