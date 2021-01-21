import java.util.*;
public class sumofdigitrecurrsion {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int z=sum(a);
        System.out.println(z);
    }
    public static int sum(int b)
    {
        int d;
        int sumofdigit=0;
        if(b==0)
            return 0;
        else
        {
            d=b%10;
            return d+sum(b/10);


        }

    }
}
