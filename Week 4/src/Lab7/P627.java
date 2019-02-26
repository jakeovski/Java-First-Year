package Lab7;

import java.util.*;

public class P627 {
    
    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        //Switches for loops to stop
        boolean stop = false;
        boolean stop1 = false;
        //Filling the first arraylist
        do {
            System.out.println("Enter the number to include in array a: \nTo stop enter - 00.");
            int input = in.nextInt();
            if (input == 00) {
                stop = true;
            }
            else {
                a.add(input);
            }
        }while (stop != true);
        //Filling the second array
        do {
            System.out.println("Enter the number to include in array b: \nTo stop enter - 00");
            int input2 = in.nextInt();
            if (input2 == 00) {
                stop1 = true;
            }
            else {
                b.add(input2);
            }
        }while (stop1 != true);
        //Testing
        System.out.println(a);
        System.out.println(b);
        System.out.println(merge(a,b));
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int size1 = a.size();
        int size2 = b.size();
        if (size2 > size1) {
            for (int i = 0; i < size1; i++) {
              result.add(a.get(i));
              result.add(b.get(i));
            }
            for (int j = size1; j < size2; j++) {
                result.add(b.get(j));
            }
        }
        else if (size1 > size2) {
            for (int i = 0; i < size2; i++) {
                result.add(a.get(i));
                result.add(b.get(i));
            }
            for (int j = size2; j < size1; j++) {
                result.add(a.get(j));
            }
        }
        return result;
    }
}