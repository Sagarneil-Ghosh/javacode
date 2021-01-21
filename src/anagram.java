import java.util.*;
public class anagram {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str=sc.next();
        int count=0;
        char a=0;
        if(s.length()==str.length())
        {
            for(int i=0;i<=s.length()-1;i++)
            {
                for(int j=0;j<=str.length()-1;j++)
                {
                    if(s.charAt(i)==str.charAt(j)) {
                        str.charAt(0);
                        count=count+1;
                    }
                    if (count ==s.length())
                    {
                        System.out.println("it is a anagram String");
                    }

                }
                if (count ==s.length())
                {
                    System.out.println("it is a anagram String");
                }
            }
        }
    }
}
