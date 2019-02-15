
import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] temp =  new double[12];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Please enter the temperature: ");
            temp[i] = in.nextDouble();
        }
        System.out.println(Arrays.toString(temp));
        System.out.println("The maximum temperature is " + max(temp));
        System.out.println("The minimum temperature is " + min(temp));
        System.out.println("The average temperature is " + average(temp));
    }
    public static double max(double[] temp) {
        double max = temp[0];
        for (double element : temp) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
    public static double min(double[] temp) {
        double min = temp[0];
        for(double element : temp) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
    public static double average(double[] temp) {
        double sum = 0;
        double average = 0;
        for (double element : temp) {
            sum += element;
            average = sum / temp.length;
        }
        return average;
    }
}