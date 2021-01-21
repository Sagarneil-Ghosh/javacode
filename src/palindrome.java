import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nember");
        int n = sc.nextInt();
        int r, s=0, x=0;

        for(int i=0;i<=n;i++)
        {   x=0;
            x = i;
        }
        while (x != 0) {
            r = x % 10;
            s = s * 10 + r;
            x = x / 10;

        }
        System.out.println(s);

        if (n == s) {
            System.out.println("palindrome");
        } else
            System.out.println("not");
    }
}
