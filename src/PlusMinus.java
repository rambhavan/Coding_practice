import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        float a = 0;
        float b = 0;
        float c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if (arr[i] > 0) {
                a++;

            }
            if (arr[i] < 0) {
                b++;

            }
            if (arr[i] == 0) {
                c++;

            }
        }
        System.out.println(a / n);
        System.out.println(b / n);
        System.out.println(c / n);


    }
}

