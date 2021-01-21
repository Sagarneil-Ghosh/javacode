import java.util.*;
public class fibonaccirecursion
{
    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int z=fibonacci(n);

            System.out.println(z);
    }
    public static int fibonacci(int a)
    {

        if(a==1)
            return 0;
        if(a==2)
            return 1;
                  if(a>2)
            return fibonacci(a-1)+fibonacci(a-2);
                  else
                      return -1;
    }
}
