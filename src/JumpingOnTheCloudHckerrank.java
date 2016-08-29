import java.util.Scanner;

/**
 * Created by rambhavan on 29/8/16.
 */
public class JumpingOnTheCloudHckerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//number of cloud
        int k = in.nextInt();//for jumping distance
        int[] a = new int[n];
        int e = 100;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i = k + i) {
            if (a[i] == 0) {
                e = e - 1;
            } else {
                e = e - 3;
            }

        }
        System.out.println(e);

    }
}
