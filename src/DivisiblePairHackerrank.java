import java.util.Scanner;

/**
 * Created by rambhavan on 19/8/16.
 */
public class DivisiblePairHackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("Enter the value of k");
        int k = in.nextInt();
        int a[] = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {// check condition till i<n
            System.out.println("Enter the value");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {// check the conditiom 1st
            for (int j = i + 1; j < n; j++) {// check the condition j
                if ((a[i] + a[j]) % k == 0) {//check the condition if add[i]+a[j]%k==0
                    num++; //then increment
                }
            }
        }
        System.out.println(num);
    }
}

