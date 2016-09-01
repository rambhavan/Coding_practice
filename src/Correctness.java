import java.util.Scanner;

/**
 * Created by rambhavan on 31/8/16.
 */
public class Correctness {
    public static void insertionSort(int[] A) {
        for (int i = 1; i <= A.length - 1; i++) {
            int j = i;
            while (j > 0 && A[j] < A[j - 1]) {
                int value = A[j];
                A[j] = A[j - 1];
                A[j - 1] = value;
                j--;
            }
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();


        }
        insertionSort(ar);
    }
}
