package Lab7;

import java.util.*;

public class Q3 {
    
    public static void main(String[] args) {
        //Decalring variables
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        //Filling arraylist
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a name: ");
            String name = in.nextLine();
            names.add(name);
        }
        //Testing
        System.out.println(names);
        System.out.println(removeDuplicates(names));
        System.out.println(sortByAlphabet(names));
        System.out.println(removeReplace(names));
        System.out.println(reverseOrder(names));
    }
    public static ArrayList<String> removeDuplicates(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            for(int y = i + 1; y < names.size(); y++) {
                names.set(i,names.get(i).toLowerCase());
                names.set(y,names.get(y).toLowerCase());
                if(names.get(i).equals(names.get(y))) {
                    names.remove(y);
                }
            }
        }
        return names;
    }
    public static ArrayList<String> sortByAlphabet(ArrayList<String> names) {
        names.sort(String :: compareToIgnoreCase);
        return names;
    }
    public static ArrayList<String> removeReplace(ArrayList<String> names) {
        Scanner in = new Scanner(System.in);
        names.remove(0);
        names.remove(names.size() - 1);
        System.out.println("Enter new name:");
        names.add(0,in.nextLine());
        System.out.println("Enter new name:");
        names.add(names.size(),in.nextLine());
        return names;
    }
    public static ArrayList<String> reverseOrder(ArrayList<String> names) {
        names.sort(String :: compareToIgnoreCase);
        Collections.reverse(names);
        return names;
    }
}