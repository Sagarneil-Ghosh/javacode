import java.util.*;
public class alternategreatest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int max=0;
        int min=0;
        int maxcount=0;
        int mincount=0;
        int l;
        int myarray2[]=new int [index];
        int myarray[] = new int [index];
        for (int i = 0; i < index - 1; i++)
        {
            myarray[i]=sc.nextInt();
        }
        for(int j=0;j<index-1;j++)
        {
            if(myarray[j]>0)
            {
                max=myarray[j];
                maxcount++;
            }
        }
        for(int k=0;k<=index-1;k++)
        {
            min = Math.min(min,myarray[k]);
            mincount++;
        }
        while(mincount>maxcount)
        break;

         for( l=0;l<index-1;l++)
             {
                  myarray2[l]=max;
                  myarray2[l]=min;
             }

        System.out.println(myarray2[l]);
    }
}
