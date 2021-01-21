//multiplication of 2d array
//  111  444
//  222  555
//  333  666

import java.util.*;
public class multiplication
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        int k=0;
        int n=sc.nextInt();
        int a[][]=new int [n][n];
        int b[][]=new int [n][n];
        int c[][]=new int [n][n];

        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                 b[i][j]=sc.nextInt();
            }
        }
        int s=0;
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                for(k=0;k<=n;k++) {

                    s = s + a[i][k] * b[k][j];
                }
                c[i][j]=s;
                s=0;
            }
        }

        System.out.println(c[i][j]);


    }
}
