package practice.general;

import java.util.Scanner;

/**
 * Created by rambhavan on 4/8/16.
 */
public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();   // taking integer input
        String binaryStr = scan.next();// string input(010101)
        int step = 0; // initalize starting counting step 0
        for (int i = 0; i <= n - 3; ) { // running loop for counting step
            if (binaryStr.substring(i, i + 3).equals("010")) {// check the condition if substring maching with staring and ending( A part of string is called substring)
                step++;// increment when match the condition
                i = i + 3;
            } else {
                i++;
            }
        }
        System.out.println(step);// print the output

    }
}

