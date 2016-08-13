import java.util.Scanner;

/**
 * Created by rambhavan on 13/8/16.
 */
public class SimpleArraySumWarmup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//Reading input
        int sum = 0;
        int[] arr = new int[n];// Initialize and create object or create space in memomry
        for (int i = 0; i < n; i++) {//check the condition
            arr[i] = in.nextInt();// rading input
        }
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }
}
