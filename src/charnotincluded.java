
import java.util.*;
public class charnotincluded
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        char c =sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=c)
            {
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
