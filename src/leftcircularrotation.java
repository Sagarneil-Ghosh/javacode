import java.util.*;
public class leftcircularrotation {
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String str=sc.next();
       char b;
       char a[]=new char[str.length()];
       for(int j=0;j<str.length();j++)
       {
           a[j]=str.charAt(j);
       }
       while(n>0)
       {
          b=a[0];
          for(int i=1;i<=str.length()-1;i++)
          {
           a[i-1]=a[i];
          }
          a[str.length()-1]=b;
          n--;
       }
       for(int i=0;i<=str.length()-1;i++)
        System.out.print(a[i]);
    }
}
