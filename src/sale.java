import java.util.*;
public class sale
{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       int index=7;
       int a[]=new int[index];
       int b;
       int c;
      int profit=0;
      int maxprofit=0;
      for (int i=0;i<index-1;i++)
      {
          a[i]=sc.nextInt();
      }
       for(int j=0;j<index-1;j++)
       {
           b=a[j];
           c=a[j+1];
           if(a[j]<a[j+1])
           {
               profit=c-b;
               maxprofit=maxprofit+profit;
           }
       }
       System.out.println("the max profit is "+maxprofit);
   }
}
