// 123   147       01  -  10
// 456   258       02  -  20
// 789   346

import java.util.*;
public class transpose {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int i=0;
        int j=0;
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
                b[i][j]=a[j][i];
            }
        }
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
}

