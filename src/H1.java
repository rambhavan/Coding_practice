import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class H1 {
    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;

            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  a sentence");
        String s = in.next();
        System.out.println("Your sentence has " + countWords(s) + " words.");
    }
}
