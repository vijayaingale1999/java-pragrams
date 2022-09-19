public class arrayFrequancy {
     public static void main(String[] args)
     {
        int[] a={10,30,20,45,33,98,30}; //taking an array
        int[] frr= new int[a.length];  //creating array to store frequancy of an element of an array
        int visited=-1,count;    //to check the given element is visited or not
        for(int i=0;i<a.length;i++)
        {
             count=1;//initializing count =1 as element occurs at least once
            for(int j=i+1;j<a.length;j++)
            {    //to check apperence of an element
                if(a[i]==a[j])
                {
                    count++;
                    frr[j]=visited; //to do not visist that element again
                }
            }    
         if(frr[i]!=visited)
                {
                    //to calaculate the element occurs
             frr[i]=count;
             System.out.println("the element"+" "+a[i]+" " +"occurs arat time :"+ " "+count);
                }
           
        }


     }
}
