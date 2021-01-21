import java.util.*;
public class Additionofconsecutiveelement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int index = sc.nextInt();
        int arr[] = new int[index];
        System.out.println("enter the no of terms to be added");
        int add = sc.nextInt();
        int s ;
        int max=0;
        int greater;
        //input
        System.out.println("enter the elements of the array");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }//working

        for (int j = 0; j < index - add + 1; j++)
        {
            s=0;
            for(int k=0;k<add;k++) {
                s = s + arr[k+j];

            }
            if (s > max) {
            max = s;
        }
        }
        System.out.println(max);
    }
}