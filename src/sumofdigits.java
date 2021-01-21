import java.util.*;
public class sumofdigits

{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int add=0;
        int a=sc.nextInt();
        int b=a;
        while(b!=0)
        {
            int c=b%10;
            b=b/10;
            add=add*10+c;
        }
        System.out.println(add);
    }
}
