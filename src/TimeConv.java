import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class TimeConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        char[] inChar = in.toCharArray();
        char[] out = Arrays.copyOfRange(inChar, 0, 8);
        if (inChar[8] == 'A' && in.substring(0, 2) == "12") {
            out[0] = 0;
            out[1] = 0;
        } else if (inChar[8] == 'P' && in.substring(0, 2) != "12") {
            String s = "" + (Integer.parseInt(in.substring(0, 2)) + 12);
            char[] f = s.toCharArray();
            out[0] = f[0];
            out[1] = f[1];
        }
        System.out.println(out);
    }
}
