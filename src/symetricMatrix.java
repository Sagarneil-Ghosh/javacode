import java.util.*;
public class symetricMatrix {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimentions of the array");
        int n=sc.nextInt();
 int count =0;
        int a[][]=new int [n][n];
        System.out.println("enter the elements of the matrix");
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                if(a[j][i]==a[j][n-1-i]||a[i][j]==a[n-1-i][j])
                    System.out.println("symetric");
            }
        }

    }
}
