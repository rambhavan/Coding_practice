import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by rambhavan on 10/7/16.
 */
public class IceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++)
                arr[j] = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < N; j++) {
                if (hm.containsKey(M - arr[j])) {
                    System.out.println((hm.get(M - arr[j]) + 1) + " " + (j + 1));
                    break;
                } else hm.put(arr[j], i);
            }
        }
    }
}
