import java.util.Scanner;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] marks = new double[20];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter your mark: ");
            marks[i] = in.nextDouble();
        }
        int pass = 0;
        int fail = 0;
        for (int i = 0; i < marks.length; i++ ) {
            if (marks[i] >= 40) {
                pass++;
            }
            else {
                fail++;
            }
        }
        System.out.println("The students that have passed the test: " + pass + "\nThe students that have failed the test: " + fail);
    }
}
