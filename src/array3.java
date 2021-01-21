/*sum of the no of duplicate numbers in an array*/

import java.util.*;
public class array3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arrayindex=sc.nextInt();
        int myarray[]=new int[arrayindex];
          int count=0;
        System.out.println("enter the elements of the array");

        for (int i=0;i<=arrayindex-1;i++)
        {
            myarray[i] = sc.nextInt();
        }
            for (int j =0; j <= arrayindex - 1;j++)
            {
                for (int k = j + 1; k <= arrayindex - 1;k++)
                {
                    if (myarray[j] == myarray[k])
                    {
                        count = count + 1;
                    }
                }
            }
        System.out.println(count);
    }
}
