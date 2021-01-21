// sagarneil ghosh
import java.util.*;
public class compareword {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        str=" "+str+" ";
        System.out.println(str);
        int largest=0;
        int a=str.length();
        int smallest=str.length()+1;
        int c=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i)!= ' ') {
               c++;

           }
            if(str.charAt(i)==' ')
            {
                if(c>largest)
                {
                    largest=c;
                }
                if(c<smallest && c!=0)
                {
                    smallest=c;
                }
                c=0;
            }

        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
