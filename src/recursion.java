import java.util.*;
public class recursion
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=factorial(n);
        if(x==1)
            System.out.println("no factorial");
        else
            System.out.println(x);

    }
    public static int factorial(int a)
    {

        if(a==0)
            return 1;
        else
            return a*factorial(a-1);
    }
}
