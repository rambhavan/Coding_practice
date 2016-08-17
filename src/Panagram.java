import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class Panagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();// taking input
        int[] a = new int[26];// initialize and create object
        int count = 0;
        for (int i = 0; i < s.length(); i++) { // create loop for counting chararcter
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {// if ascii value from 65 to 90 then
                if (a[s.charAt(i) - 65] == 0)// check if current value 0 then count increment'
                    count++;
                a[s.charAt(i) - 65]++;

            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (a[s.charAt(i) - 97] == 0)
                    count++;
                a[s.charAt(i) - 97]++;
            }

        }
        if (count == 26)
            System.out.println("Pangram");
        else
            System.out.println("Is not Pangram");


    }
}
