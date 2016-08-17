import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by rambhavan on 17/8/16.
 */
public class SuperStringReduction {
    public static char redux(char left, char right) {
        if (left == 'a') {
            if (right == 'b')
                return 'b';
            if (right == 'c')
                return 'c';
        }
        if (left == 'b') {
            if (right == 'c')
                return 'c';
            if (right == 'a')
                return 'a';
        }
        if (left == 'c') {
            if (right == 'a')
                return 'a';
            if (right == 'b')
                return 'b';
        }
        return left;

    }

    public static int reduction(String a) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < a.length(); i++) {
            char res = a.charAt(i);
            while (!stack.empty()) {
                char peek = stack.peek();
                if (peek == res)
                    break;
                else {
                    char pooped = stack.pop();
                    res = redux(res, pooped);
                }
            }
            stack.push(res);
        }
        return stack.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String p = br.readLine();
            int res = SuperStringReduction.reduction(p);
            System.out.println(res);
        }
    }
}
