import java.util.Scanner;

/**
 * Created by rambhavan on 29/8/16.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();//enter test case
        for (int i = 0; i < testCase; i++) { //enter the value
            int n = in.nextInt();
            int height = 1;
            for (int j = 0; j <= n; j++)// check the ncondition
            {
                if (j == 0)// if j=0
                {
                    height = 1;
                } else if (j % 2 != 0) {
                    height = height * 2;
                } else if (j % 2 == 0) {
                    height += 1;
                }
            }
            System.out.println(height);
        }
    }
}
