import java.util.Scanner;

/**
 * Created by rambhavan on 19/8/16.
 */
public class KangarooHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 , v1 ,x2 ,v2");
        int x1 = sc.nextInt();// First kangaroo location raeding
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        int t1 = 0;// when first kangaroo jumping count
        int t2 = 0;// when 2md kangaroo jumping than count
        while (x1 < 10000000 || x2 < 10000000)// checking condition if both are equal or single condition true
        {
            x1 = (x1 + v1);// sum of 1st kangaroo jump from on x axis to n point
            t1++;//increment when kangaroo jump
            x2 = (x2 + v2);// sum of 2nd kangaroo
            t2++;//increment
            if (x1 == x2)// check the conditon when both kangaroo jump x1=x2
            {
                if (t1 == t2)//check the condtion both are jump same distance then incrment also same t1=t2 then print yes
                {
                    System.out.println("YES");
                    break;
                }
            }
        }
        if (x1 != x2)// if not same then no
            System.out.println("NO");
    }
}
