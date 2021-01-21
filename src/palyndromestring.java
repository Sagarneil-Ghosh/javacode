/*wap to take a string as input and count the no of palybndrome words*/
import java.util.*;
public class palyndromestring
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        int n = str.length();
        String a[] = new String [n];
        str = " " + str ;
        String s1 ="";
        String s2 ="";
        String d ="";
        String s3 = "";
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            char c = str.charAt(i);
            if(c==' ')
                for (int j = i; j < n;j++)
                {
                    char f = str.charAt(j);
                    if(c==' ')
                        break;
                    s3 = s3 + d;
                }

            a[count] = s3;
            count++;

        }

        for(int i=0;i<=count;i++)
        {

        }
    }

}
