import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class Day3Hackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = " ";
        if (n % 2 == 1) {
            ans = " Wired ";
            // System.out.println("It is wired");
        } else {
            if (n % 2 >= 2 && n % 2 <= 5) {
                ans = "it is not wired.";
            }
            if (n % 2 >= 6 && n % 2 <= 20) {
                ans = "Wired";
            }
            if (n % 2 >= 6 && n % 2 <= 20) {
                ans = "It is not wired.";
            }
            System.out.println(ans);


        }

    }
}
