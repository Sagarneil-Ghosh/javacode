import java.util.*;
import java.lang.*;
public class   Firstname
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        char ch1;
        char ch2=' ';
        for(int i=0;i<=a.length()-1;i++)
        {
            ch1=a.charAt(i);
            if(ch1==ch2)
            {
                System.out.println("first name is "+a.substring(0,i));
                System.out.println("last name is "+a.substring(i+1,a.length()));
            }
        }
    }
}
