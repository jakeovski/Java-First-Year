package Lab7;

import java.util.*;

public class P630 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> sales = new ArrayList<>();
        ArrayList<String> customers = new ArrayList<>();
        boolean stop = false;
        do {
            System.out.println("Enter the name of the customer: ");
            customers.add(in.nextLine());
            System.out.println("How much did he spend? ");
            sales.add(in.nextDouble());
            in.nextLine();
            System.out.println("Continue?\nAny number - Yes\n2 - No");
            int input1 = in.nextInt();
            in.nextLine();
            if (input1 == 2) {
                stop = true;
            }
        }while (stop != true);
        System.out.println(customers);
        System.out.println(sales);
        System.out.println("Best customer of the day is " + nameOfBestCustomer(sales,customers));
    }
    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers) {
        double largest = 0;
        int index = 0;
        for(Double num : sales) {
            if (num > largest) {
                largest = num;
                index = sales.indexOf(num);
            }
        }
        String winner = customers.get(index);
        return winner;
    }
}