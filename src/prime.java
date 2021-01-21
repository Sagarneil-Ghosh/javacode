import java.util.*;
public class prime {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=a;
        int z=primeno(a,c-1);
        if(z==0)
            System.out.println("prime");
        else
            System.out.println("notprime");
    }
    public static int primeno(int b,int d)
    {
        if(d==1)
            return 0;
      if(b%d==0)
          return 1;

         return primeno(b,d-1);


          }
}
