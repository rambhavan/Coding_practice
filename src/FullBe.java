import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class FullBe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String string = in.next();
        in.close();
        int Step = 0;
        for (int i = 0; i <= n - 4; ) {

            if (string.substring(i, i + 4).equals("0101")) {
                Step++;
                i = i + 4;
            } else {
                i++;
            }

        }
        System.out.println(Step);

    }

}
