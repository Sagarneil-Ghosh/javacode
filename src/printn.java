import java.util.*;
public class printn {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print(a);

    }
    public static int print(int b)
    {
       if (b==0)
       {
           return 1;
       }
       else
       {
           print(b-1);
           System.out.println(b);

       }
        return 1;
    }
}

