import java.util.Scanner;

/**
 * Created by rambhavan on 1/9/16.
 */
public class RuningTimeHackerrank {
    int insertionSort(int ar[]) {
        //This counter will count the number of shifts
        int count = 0;

        for (int i = 1; i < ar.length; i++) {
            int value = ar[i];
            int j = i - 1;

            while (j > -1 && ar[j] > value) {
                ar[j + 1] = ar[j]; //shift right
                j--;
                count++; //Every time a shift happen we increase count by 1
            }
            ar[j + 1] = value;
        }
        // System.out.println("Count: "+count);
        return count;
    }

    //This method prints array
    void print(int ar[]) {
        for (int i : ar)
            System.out.print(i + " ");
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int ar[] = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = in.nextInt();
        }

        RuningTimeHackerrank s = new RuningTimeHackerrank();
        int shifts = s.insertionSort(ar);
        System.out.println(shifts);
    }
}
