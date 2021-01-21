import java.util.*;
public class secondhightelement {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int max=0;

        int max2=0;
        int index=sc.nextInt();
        int Myarray[]=new int [index];
        for (int i=0;i<=index-1;i++)
        {
            Myarray[i]=sc.nextInt();
        }
        for(int j=0;j<=index-1;j++)
        {
            if(Myarray[j]>6)
            {
                max=Myarray[j];
            }
        }
        for(int k=0;k<=index-1;k++)
        {

            if(Myarray[k]>max2 && Myarray[k]!=max)
            {

                max2=Myarray[k];

            }
        }
        System.out.println(max2+"  "+max);
    }

}
