import java.util.*;
public class reversearay
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int swap;
        int low=0;
        int high=a-1;
        int myarray[]=new int[a];
        for (int i=0;i<=myarray.length-1;i++)
        {
            myarray[i]=sc.nextInt();
        }
        while(low<high)
        {
            swap=myarray[low];
            myarray[low] =myarray[high];
            myarray[high] =swap;
            low=low+1;
            high=high-1;
        }
        for(int j=0;j<=myarray.length-1;j++)
            System.out.println(myarray[j]);
    }
}
