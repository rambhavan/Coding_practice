import java.util.Scanner;

/**
 * Created by rambhavan on 29/8/16.
 */
public class miniDistanceHackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int minDistance = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        // for checking matching and calculate
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j] && i != j) {

                    int value = Math.abs(j - i);
                    if (minDistance != 0)
                        minDistance = Math.min(value, minDistance);
                    else
                        minDistance = value;
                }
            }
        }
        // print end result
        if (minDistance != 0)
            System.out.println(minDistance);
        else
            System.out.println("-1");
    }

}
