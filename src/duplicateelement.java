import java.util.*;
public class duplicateelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array ");
        int index = sc.nextInt();
        int myarray[] = new int[index];
        int myarray2[] = new int[index];
        int i = 0;
        int j = 0;
            System.out.println("enter the elements of the array");
            for (i = 0; i <= index - 1; i++) {
                myarray[i] = sc.nextInt();
            }
            for (i = 0; i < myarray.length - 1; i++) {
                for (j = i + 1; j < myarray.length; j++) {
                    if ((myarray[i] == myarray[j]) && (i != j)) {
                        myarray[j] = myarray[j + 1];
                    }
                    System.out.println(myarray[j]);
                }
            }
        }

}
