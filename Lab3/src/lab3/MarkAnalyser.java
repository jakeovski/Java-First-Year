package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class MarkAnalyser {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many grade you want to analyse?: \n");
        int num = in.nextInt();
        int[] marks = new int[num];
        double average = 0;
        for(int i = 0; i < num; i++) {
            System.out.println("Enter your mark: ");
            marks[i] = in.nextInt();
            average += marks[i];
        }
        average = average / num;
        int procent = 0;
        if (average < 2.0) {
            procent += 0;
        }
        else if (average < 3.0 && average > 2.0) {
            procent += 30;
        }
        else if (average < 4.0 && average > 3.0) {
            procent += 60;
        }
        else if ( average > 4.0 ) {
            procent += 90;
        }
        System.out.println(Arrays.toString(marks));
        System.out.println("Your average mark is " + average);
        System.out.println("Procentage: " + procent);
        switch (procent) {
            case 90:
            {
                System.out.println("Congratulations! You Pass with highest results!");
                break;
            }
            case 60:
            {
                System.out.println("Congratulations! You pass!");
                break;
            }
            case 30:
            {
                System.out.println("Unfortunately you don't meet the requirments.");
                break;
            }
            default:
                System.out.println("You have terrible results. Sorry");
                break;
        }
    }
}
