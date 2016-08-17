import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rambhavan on 17/8/16.
 */
public class PalidromeNumber {
    public static void main(String[] args) {
        // enter the number
        System.out.println("Enter the number for check");
        int number = 0; //
        try {
            //take input from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //prase the line into integer
            number = Integer.parseInt(br.readLine());

        } catch (NumberFormatException ne) {

            System.out.println("Invalid input" + ne);
            System.exit(0);

        } catch (IOException ioe) {
            System.out.println("io error is : " + ioe);
            System.exit(0);
        }
        System.out.println("Number :" + number);
        int n = number;
        int temp = 0;
        int reversnumber = 0;

        // reverse the number
        while (n > 0) {

            temp = n % 10;
            n = n / 10;
            reversnumber = reversnumber * 10 + temp;

        }
        if (number == reversnumber)
            System.out.println("Number is palindrone number");
        else
            System.out.println("number is not palindrone number");


    }
}
