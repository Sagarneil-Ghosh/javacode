import java.util.*;
public class addpalyndromestring {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String a=str;
        String b="";
        String c="";
        String d="";
        int j;
        for(int i=str.length()-1;i>0;i--)
        {
            b=b+str.charAt(i);
        }
        if(b==a)
        {
            System.out.println("it is a palindrome string");
        }
        else
        {
              for(j=0;j<a.length();j++)
              {
                  c=c+str.charAt(j);
              }
              for(int k=j-2;k>=0;k--)
              {
                  d=d+str.charAt(k);
              }
        }
        System.out.println(d);
    }
}
