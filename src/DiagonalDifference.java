import java.util.Scanner;

/**
 * Created by rambhavarn on 13/8/16.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//reading input
        int[][] a = new int[n][n];//create two dimensional array
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < n; i++) {// loop for row
            for (int j = 0; j < n; j++) {// loop for column
                a[i][j] = in.nextInt();
                if (i == j) {// check condition if row and column equal then add from right side
                    diagonal1 += a[i][j];
                }
                if (i == j - n - 1) {//chck the condition from left side and add diagonal number
                    diagonal2 += a[i][j];

                }

            }
        }


        int difference = diagonal1 - diagonal2;
        System.out.println(Math.abs(difference));

    }
}
