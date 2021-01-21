import java.util.*;

public class leftrotation {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        System.out.println("enter size of the Array ");
        int n =in.nextInt();
        int a[]=new int[n];

        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        System.out.println("enter the no of rotation");
        int x=in.nextInt();
         while(x>=n)
         {
             x-=n;
         }
        for(int i=x;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(a[i]);
        }




    }

}
