import java.util.*;
public class string2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int max=0;
        int c;
        int min=a.length()+1;
        for(int i=0;i<=a.length()-1;i++)
        { c=0;
            for(int j=i+1;j<=a.length()-1;j++)
            {
                if(a.charAt(i)==a.charAt(j)&&a.charAt(i)!=' ')
                {

                   c++;
                   if(max<c)
                   {
                       max=c;
                   }
                   if(c<min)
                   {
                       min=c;
                   }
                }
            }
        }
        System.out.println(max+1);
        System.out.println(min);
    }
}
