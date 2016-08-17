import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class ConstructionString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//Reading input
        int[] value = new int[n];//calculate cost

        for (int i = 0; i < n; i++) {// check the condition till i <n
            int num = 0;
            String s = in.next();//reding string input
            char[] chars = s.toCharArray();// convert string into character
            Arrays.sort(chars);
            // sorting character
            for (int j = 1; j <= chars.length; j++) {//run loop till j=length of the character
                if (chars[j] != chars[j + 1]) {// check the condition if chars[j] not same to chars[j+1] then
                    num++;// incremnet num
                    value[i] = num;// if not same then value count
                }
            }
        }
        System.out.println(value);
    }

}
