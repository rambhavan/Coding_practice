import java.util.Scanner;

/**
 * Created by rambhavan on 17/8/16.
 */
public class PersonClass {
    private int age;

    public PersonClass(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Is it not valid");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int age = in.nextInt();
            PersonClass p = new PersonClass(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();

        }

    }

    void amIOld() {
        if (age < 13) {
            System.out.println("You are Young");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are old");
        }
    }

    void yearPasses() {
        age++;
    }
}
