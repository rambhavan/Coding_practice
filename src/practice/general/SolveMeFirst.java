package practice.general;

import java.util.Scanner;

/**
 * Created by rambhavan on 13/8/16.
 */
public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

    static int solveMeFirst(int a, int b) {

        return a + b;
    }

}
