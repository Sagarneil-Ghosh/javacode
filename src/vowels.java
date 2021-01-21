import java.util.*;
public class vowels
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        int i=0;
        int x=0;
        char vowel;
        char c;
        for(i=0;i<=a.length()-1;i++)
        {
             c=a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
               x=(int)c;
               x=x-32;
               c=(char)x;
               b=b+c;
            }
            else
            {
                b=b+c;
            }
        }
        System.out.println(b);
    }
}
