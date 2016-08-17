import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases > 0) {

            String str = in.next();
            char[] original = str.toCharArray();//create array of character
            char[] reverse = str.toCharArray();// create array of character

            for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {// check condition
                original[i] = str.charAt(i);// index
                reverse[j] = str.charAt(i);//index
            }

            for (int i = 0, j = 1; j < str.length(); j++, i++) {
                int val1 = Math.abs(original[j] - original[i]);
                int val2 = Math.abs(reverse[j] - reverse[i]);
                if (val1 != val2)
                    System.out.println("Not Funny");
                else if (val1 == val2 && j == str.length())
                    System.out.println("Funny");
            }

            testCases--;

        }
        in.close();

    }
}
