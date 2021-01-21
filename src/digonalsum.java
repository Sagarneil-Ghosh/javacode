import java.util.Scanner;

public class digonalsum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int [n][n];
        int i=0;
        int j=0;
        int s=0;
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int b=0;
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                if(i==b&&j==b)
                {
                    s=s+a[i][j];
                }
            }
            b++;
        }

        System.out.println(s);

    }
}

