import java.util.*;
public class fibonacciSeries
{
    public static void main(String[]args)
    {
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        int s=0;
                int x=0;
                int a=0;
        for(int i=1;i<=n;i++)
        {
            x=s+p;
            s=p;
            p=x;
            a=a+x;
            if(i!=n)
            System.out.print(x+"+");
            else
                System.out.print(x);
        }
        System.out.print("="+a);

    }
}
