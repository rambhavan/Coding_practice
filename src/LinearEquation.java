import java.util.Scanner;


public class LinearEquation {
    public static void main(String[] args) {
        char[] var = {'x', 'y', 'z', 'w'};
        System.out.println("Enter the number of variable int he equation");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter the coefficients of each variable for each equation");
        System.out.println("ax+by+cz+.......=d");
        double[][] mat = new double[n][n];
        double[][] constants = new double[n][n];
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                mat[i][j] = input.nextDouble();
            }
            constants[i][0] = input.nextDouble();
        }
        // Matrix represation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" " + mat[i][j]);
            }
            System.out.print(" " + var[i]);
            System.out.print(" " + constants[i][0]);


        }
    }
}
