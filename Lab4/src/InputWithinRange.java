import java.util.Scanner;

public class InputWithinRange {
    public static void main(String[] args) {
        range(1,10);
    }
    public static double range(double a, double b) {
        Scanner in = new Scanner(System.in);
        int again = 0;
        double value;
        do {
            System.out.println("Please enter a value that is in range: ");
            value = in.nextDouble();
            if (value < a || value > b) {
                System.out.println("Try again");
                again = 1;
            }
            else {
                again = 0;
            }
        } while (again == 1);
        System.out.println("You are in range with a value " + value);
        return value;
    }
}
