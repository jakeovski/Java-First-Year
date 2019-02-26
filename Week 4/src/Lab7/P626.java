package Lab7;

import java.util.*;

public class P626 {
    
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
        System.out.println(append(a,b));
    }
    //Method to join two arraylists
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        a.addAll(b);
        return a;
    }
}