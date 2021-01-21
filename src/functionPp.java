import java.util.*;
public class functionPp
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int z=prime(a);
        int x=palindrome(a);
        if(z==1)
            System.out.println("prime");
       else
            System.out.println("not prime");
        if(x==1)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }

   public static int prime(int b)
    {
        int count=0;
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)
            {
                count++;
            }
        }
        if(count==2)
            return 1;
        else
            return 0;
    }
    public static int palindrome(int c)
    {
        int s=0;
        int q=c;
        int p;
        while(q!=0)
        {
             p=q%10;
            q=q/10;
            s=s*10+p;
        }

        if(s==c)
            return 1;
        else
            return 0;
    }
}
