import java.util.*;
public class newpalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = palindrome(n);
        if(z==1)
            System.out.println("palindrome no");
        if(z==0)
            System.out.println("not palindrome no");
    }

    public static int palindrome(int b) {
        int a = b;
        int s = 0;
        while (a != 0) {
            int x = a % 10;
            a = a / 10;
            s = s * 10 + x;
        }
        if (s == b)
            return 1;
        else
            return 0;
    }
}
