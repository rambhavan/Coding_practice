import java.util.Scanner;

/**
 * Created by rambhavan on 13/8/16.
 */
public class VeryBigSUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (long num : arr) {
            sum += num;

        }
        System.out.println(sum);
        /** Scanner scan = new Scanner(System.in);
         int length = scan.nextInt();
         long sum= 0;
         for(int x =0;x<length;x++){
         sum+=scan.nextInt();
         }
         System.out.println(sum);*/

    }
}
