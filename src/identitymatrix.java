import java.util.*;
public class identitymatrix {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int arr[][]=new int[m1][m2];
        int i;
        int j;
        System.out.println("enter the elements of the array");
        for(i=0;i<=m1-1;i++)
        {
            for(j=0;j<=m2-1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        if(arr[0][0]==1&&arr[0][1]==0&&arr[0][2]==0&&arr[1][0]==0&&arr[1][1]==1&&arr[1][2]==0&&arr[2][0]==0&&arr[2][1]==0&&arr[2][2]==1)
        {
            System.out.println("identity matrix");
        }
    }
}
