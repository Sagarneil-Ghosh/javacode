import java.util.*;
public class function
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int z=print(a);
        System.out.println(z);
    }
    public static int print(int b)
    {
        int sum=0;
        for(int i=1;i<=b;i++)
        {
           sum=sum+i;
        }
        return sum;
    }
}
