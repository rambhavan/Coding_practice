import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rambhavan on 31/8/16.
 */
public class BeautifulTriplate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println(beautifultriplate(list, n, d));

    }

    private static int beautifultriplate(List<Integer> list, int n, int d) {

        int count = 0;
        for (Integer v : list) {
            if (list.contains((v + d)) && list.contains((v + 2 * d))) {
                count++;
            }

        }
        return count;
    }
}
