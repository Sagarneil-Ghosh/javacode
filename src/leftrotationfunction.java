import java.util.*;
public class leftrotationfunction {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    System.out.println("enter the no of rotation");
    int d=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    rotate(arr ,d,n);
}
public static void rotate(int a[],int b,int c)
{
    while(b>c)
    {
        b-=c;
    }

    for(int j=b;j<=c-1;j++)
    {
        System.out.println(a[j]);
    }

    for(int i=0;i<=b-1;i++)
    {
        System.out.println(a[i]);
    }
}


}
