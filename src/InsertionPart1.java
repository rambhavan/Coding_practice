import java.util.Scanner;

/**
 * Created by rambhavan on 8/7/16.
 */
public class InsertionPart1 {
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int V = ar[ar.length - 1];
        int i = ar.length - 2;
        while (i >= 0 && ar[i] > V) {
            ar[i + 1] = ar[i];
            i--;
            printArray(ar);
        }
        ar[i + 1] = V;
        printArray(ar);
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
