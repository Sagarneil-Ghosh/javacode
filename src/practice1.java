import java.util.*;
public class practice1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("no of rotation");
        int d=sc.nextInt();
        int arr2[]=new int[d];
        int b=0;
        int j=0;
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( j=0;j<d-1;j++)                                  //3,5,6,7,8,9
        {
            arr2[j]=arr[j];
        }
        for (int i = d; i < n-1; i++)
        {
            arr[i + n - d]=arr2[i];
        }
        for (int i = 0; i < n-1; i++)
            System.out.print(arr[i] + " ");
    }
}
