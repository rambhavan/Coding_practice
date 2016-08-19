import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the array element");
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        // System.out.println("Enter the elemnet");
        // b[j]=in.nextInt();
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        for (int j = 0; j < b.length; j++)
            b[j] = in.nextInt();
        for (int i : a) {
            System.out.print(" " + i);

        }
        int min = a[0];

        int i = 0;
        ;
        if (a[i] < min) {
            min = a[i];

        }
        System.out.println(" \n" + min);
        for (int j : b) {
            System.out.print(" " + j);
        }
        int min1 = b[0];
        int j = 0;
        if (b[i] < min1) {
            min1 = b[j];
        }
        System.out.println(" \n" + min1);
        int add;
        add = min + min1;
        System.out.println(add);

    }

}
