import java.util.*;
public class primepalindrome2
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int i=2;
        int j=1;
        int count = 0;
        for (i = 1; i <= n; i++)
        {
            for ( j = 1; j <= i; j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==2)
                System.out.println(i);
            count=0;
        }

    }
}
