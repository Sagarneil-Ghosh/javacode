import java.util.*;
public class camelcase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s="";
        int c;
        int x=0;
        int y=0;
        char p;


        for(int i=0;i<=a.length()-1;i++)
        {
            char b=a.charAt(i);
            c=(int)b;
            if(c>=65&&c<=90) {
                x = c + 32;
            }
            else if(c>=97&&c<=122)
            {
                x= c - 32;
            }
             p=(char)x;
             s=s+p;
        }System.out.println(s);
    }
}
