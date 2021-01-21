import java.util.*;
public class sortedarray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int p=0;
        int i=0;
        int j=0;
        int count=0;
        int myarray[]=new int[index];
        System.out.println("enter a sorted array");
        for(i=0;i<=myarray.length-1;i++)
        {
            myarray[i]=sc.nextInt();
        }
        for( j=0;j<myarray.length-1;j++)
        {
         if(myarray[j]==myarray[j+1])
         {
             count++;

         }

         if(myarray[j]!=myarray[j+1])
         {
             count++;
             System.out.println(myarray[j]+"-"+count);
             count=0;

         }

        }
        count++;
        System.out.println(myarray[j]+"-"+count);
    }
}
