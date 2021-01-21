import java.util.*;
public class factorialrecurrsion {
    public static void main(String[]args)

    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int z=factorial(a);
        System.out.println(z);
    }
    public static int factorial(int b)
    {
        if (b==0)
            return 1;
        else
        {
            return b*factorial(b-1);
        }
    }
}
