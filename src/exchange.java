import java.util.*;
public class exchange {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         System.out.println(s.substring(s.length()-1)+s.substring(1,s.length()-1)+s.substring(0,1));

    }
}
