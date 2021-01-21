/*find the nth occurrence of an array.*/
import java.util.Scanner;

public class arrayy6
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int b = sc.nextInt();
        int myarray[] = new int[b];
       int count=0;
        System.out.println("enter the elements in an array");
        for (int i = 0; i <= b - 1; i++)
        {
            myarray[i] = sc.nextInt();
        }
        for (int j = 0; j <= b - 1; j ++)
        {
            for(int k=j+1;k<=b-1;k++)
            {
                if(myarray[j]==myarray[k])
                {
                    count=count+1;
                }
            }
        }
        System.out.println("nth occurrence of the number is "+count);
    }
}
