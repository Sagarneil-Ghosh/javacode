import java.util.*;
public class Sumofdigitsprimefunction {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = sumofdigits(a);
        int b = prime(z);
        if (b == 1)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
    public static int sumofdigits(int b)
    {
        int c=b;
        int d;
        int sum=0;
        while(b!=0)
        {
            d=b%10;
            b=b/10;
            sum=sum+d;
        }
        return sum;
    }
    public static int prime(int d)
    {
        int count=0;
        for(int i=2;i<d;i++)
        {
            if(d%i==0)
            {
                count=count+i;
            }
        }
        if(count ==0)
            return 1;
        else
            return 0;
    }
}
