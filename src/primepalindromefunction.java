import java.util.*;
public class primepalindromefunction {
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int z=prime(a);
        int m=palindrome(a);
        if(z==1&&m==1)
            System.out.println("primepalindrome");
        else if (z==1&&m==0)
            System.out.println("prime but not palindrome");
        else if(z==0&&m==1)
            System.out.println("palindrome but not prime");
        else
            System.out.println("neither prime nor palindrome");
    }
    public static int prime(int c)
    {
        int count=0;
       for(int i=2;i<c;i++)
       {
           if(c%i==0) {
               count = count + i;
           }
       }
       if(count ==0)
           return 1;
       else
           return 0;

    }
    public static int palindrome(int d)
    {
        int a=d;
        int e;
        int add=0;

        while (d!=0)
        {
            e=d%10;
            d=d/10;
            add=add*10+e;

        }
        if(add==a)
        return 1;
        else
            return 0;
    }
}
