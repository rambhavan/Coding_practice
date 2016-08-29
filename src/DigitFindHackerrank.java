import java.util.Scanner;

/**
 * Created by rambhavan on 29/8/16.
 */
public class DigitFindHackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int temp = n;
            int count = 0;
            while (temp > 0) {
                int number = temp % 10;
                if (number != 0) {
                    if (n % number == 0) {
                        count++;
                    }
                }
                temp = temp / 10;
            }
            System.out.println(count);
        }

    }
}

