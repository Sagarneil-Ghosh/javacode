import java.util.*;
public class array2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the first array");
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter the size of the second array");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int arr[][] = new int[n1][n2];
        int arr2[][]=new int [m1][m2];
        int result[][]=new int [n1][n2];
int i;
int j = 0;
int k;
int l = 0;


        System.out.println("enter the elements of the first array");
        for ( i = 0; i <= n1-1; i++) {
            for( j=0;j<=n2-1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the elements of the second array");
        for( k=0;k<=m1-1;k++)
        {
            for( l=0;l<=m2-1;l++)
            {
                arr2[k][l]=sc.nextInt();
            }
        }

        System.out.println("enter 1 for addition");
        System.out.println(("enter 2 for substraction"));
        int n=sc.nextInt();

        switch (n) {
            case 1:
                for (i = 0; i <= n1 - 1; i++) {
                    for (j = 0; j <= n2 - 1; j++) {
                        result[i][j] = arr[i][j] + arr2[i][j];
                    }

                }

                break;
            case 2:
                for (i = 0; i <= n1 - 1; i++) {
                    for (j = 0; j <= n2 - 1; j++) {
                        result[i][j] = arr[i][j] - arr2[i][j];
                    }

                }
        }

        for ( i = 0; i <= n1-1; i++) {
            for( j=0;j<=n2-1;j++)
            {
                System.out.println(result[i][j]);
            }
        }
    }
}
