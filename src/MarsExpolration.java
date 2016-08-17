import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class MarsExpolration {
    public static void main(String[] args) {
        int m = 0;
        List<String> p = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String s = input.next(); // reading string

        //char[] p = s.toCharArray();
        for (int i = 0; i < s.length(); i += 3) {
            p.add(s.substring(i, i + 3));
        }
        for (String s1 : p) {
            if (s1.charAt(0) != ('s')) {
                m++;
            }
            if (s1.charAt(1) != ('o')) {
                m++;
            }
            if (s1.charAt(2) != ('s')) {
                m++;
            }
        }
        System.out.println(m);
    }
}

