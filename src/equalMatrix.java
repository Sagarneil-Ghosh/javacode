import java.util.*;
public class equalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions of the first array");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("enter the dimensions of tha 2nd array");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int i = 0;
        int j = 0;
        int count=0;

        int a[][] = new int[n1][n2];
        int b[][] = new int[n3][n4];
        System.out.println("enter the elements of the first array");
        for (i = 0; i <= n1 - 1; i++) {
            for (j = 0; j <= n2 - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of the 2nd array");
        for (i = 0; i <= n3 - 1; i++) {
            for (j = 0; j <= n4 - 1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i <= n1-1; i++) {
            for (j = 0; j <= n2- 1; j++) {
                if (n1 == n3 && n2 == n4 && a[i][j] == b[i][j]) {
                    {
                        count++;
                        System.out.println(a[i][j]+" "+b[i][j]);
                    }
                }
            }
        }
        System.out.println(count);
        if(count ==n1*n2) {

            System.out.println("equal matrix");
        }
        else
            System.out.println("not equal matrix");
    }
}
