import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class Funny {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//reding integer input

        while (n > 0)// check condition if input n>0;
        {
            String s = in.next();
            char[] str = s.toCharArray();//convert string into character
            char[] revers = s.toCharArray();//convert string into character
            for (int i = 0; i < s.length(); i++) {// loop working till string length
                str[i] = s.charAt(i);//taking character ans show ascii value
                for (int j = s.length(); j <= 0; j--) {//check the condition for reverser the string
                    revers[j] = s.charAt(j);//taking character ans show asci value
                }
            }
            for (int i = 0; i < s.length(); i++) {  // loop used for
                for (int j = 0; j < s.length(); j++) {
                    int value1 = Math.abs(str[j] - str[i]);
                    int value2 = Math.abs(revers[j] - revers[i]);// geting absolute value
                    if (value1 != value2) //if value is not equal thean else
                        System.out.println("is not funny");
                    else if (value1 == value2 && j == s.length() - 1)
                        System.out.println("funny");
                }
            }
            n--;

        }
        in.close();

    }
}
