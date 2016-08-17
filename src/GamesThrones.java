import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by rambhavan on 17/8/16.
 */
public class GamesThrones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Set<Character> set = new HashSet<Character>();
        for (Character ch : str.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        System.out.println((set.size() <= 1) ? "YES" : "NO");


        scan.close();

    }
}
