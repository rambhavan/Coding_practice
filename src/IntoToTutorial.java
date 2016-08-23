import java.util.Scanner;

/**
 * Created by rambhavan on 8/7/16.
 */
public class IntoToTutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();
        scan.nextInt();
        int i = 0;
        while (scan.nextInt() != search) {
            i++;
        }
        System.out.println(i);
    }

}

