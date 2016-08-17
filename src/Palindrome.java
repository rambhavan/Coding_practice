import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class Palindrome {
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {

            String s = sc.next();

            char[] c = s.toCharArray();
            int x = 0;
            int y = c.length - 1;
            int index = -1;
            while (x < y) {
                if (c[x] == c[y]) {
                    x++;
                    y--;

                } else {
                    if (c[x + 1] == c[y] && c[x + 2] == c[y - 1]) {
                        index = x;
                        x = x + 2;
                        y = y - 1;

                        break;
                    } else {
                        index = y;
                        y = y - 2;
                        x = x + 1;

                        break;
                    }
                }
            }
            System.out.println(index);
        }
    }
}
