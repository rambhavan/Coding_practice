import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rambhavan on 30/8/16.
 */
public class ServiceLaneHackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();// lenght of service lane
        int testCase = in.nextInt();// test case
        /**int[] width = new int[length];
         for (int i = 0; i < length; i++) {
         width[i] = in.nextInt();//enter lenght

         }
         for (int i = 0; i < testCase; i++) {
         int start = in.nextInt();
         int end = in.nextInt();
         int output = serviceLane(width, start, end);//calling method for starting and ending point
         System.out.println(" " + output);
         }
         in.close();

         }

         private static int serviceLane(int[] width, int start, int end) {
         int min = 3;
         for (int j = start; j <= end; j++) {
         if (width[j] < min) {
         min = width[j];
         }
         }
         return min;
         */
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            l.add(in.nextInt());
        }
        List l2;
        for (int j = 0; j < testCase; j++) {
            l2 = new ArrayList();

            int start = 0;
            start = in.nextInt();
            int exit = 0;
            exit = in.nextInt();
            for (int k = start; k <= exit; k++) {
                l2.add(l.get(k));
            }
            System.out.println(Collections.min(l2));
        }
    }
}



