/*Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced.
        An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.*/

import java.util.*;
public class balancedarray
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int b=index;
        int sum1=0;
        int sum2=0;
        int j;
        int k;
        int diff;
        int myarray[]=new int [index];
        for(int i=0;i<=index-1;i++)
        {
            myarray[i]=sc.nextInt();
        }
     if(index%2==0) {
         for (j = 0; j <= b / 2; b++) {
             sum1 = sum1 + j;
         }
         for (k = j + 1; k <= b; b++) {
             sum2 = sum2 + k;
         }
         if(sum1>sum2) {
             diff = sum1 - sum2;
             sum2 = sum2 + diff;
         }
         if(sum2>sum1) {
             diff = sum2 - sum1;
             sum1 = sum1 + diff;
         }
         System.out.println("the left half of the element "+sum1+"the right half of the element "+sum2);
     }
         if (index % 2 != 0)
         {

         }
    }
}
