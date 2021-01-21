//prime palindrome number
 import java.util.*;
public class primepalindrome
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int count=0;
        int add=0;
        for (int i=2;i<a;i++)
        {

            if(a%i==0)
            {
              count=count+1;
            }
        }
        if(count==0)
        {
            System.out.println("The number is prime");
            while(b!=0)
            {
                int c=b%10;
                b=b/10;
                add=add*10+c;
            }
            if(a==add)
            {
                System.out.println("The number is palindrome");
            }
            else
            {
                System.out.println("the no is not palindrome");
            }
        }
        else
        {
            System.out.println("the number is not prime");
        }
    }
}
