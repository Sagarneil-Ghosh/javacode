import java.util.*;

public class arraynew
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your mobile number");
        long mobno=sc.nextLong();
        System.out.println("Enter the cost");
        int cost=sc.nextInt();

        double x=showroom(cost,mobno,name);

        System.out.println("name="+name);
        System.out.println("mobno"+mobno);
        System.out.println("cost="+cost);
        System.out.println("amount after discount"+x);


    }

    public static double showroom(int cost,long mobno,String name)
    {
        int  dis=cost;double amo;
        if(dis<=10000) {
            amo = ((5 / 100) * dis);
            return amo;
        }
        else if(dis>10000&&dis<=20000) {
            amo = ((10 / 100) * dis);
            return amo;
        }
        else if(dis>20000&&dis<=35000) {
            amo = ((15 / 100) * dis);
            return amo;
        }
        else {
            amo = ((20 / 100) * dis);
            return amo;
        }
    }
}