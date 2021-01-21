import java.util.*;
public class fibonaccifunction {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int m= fibonacci(n);
        System.out.println(m);
    }
    public static int fibonacci(int a)
    {
        int s=0;
        int x=0;
        int p=1;
        for(int i=1;i<=a;i++)
        {
            x=s+p;
            s=p;
            p=x;
        }
       return x;
    }
}
