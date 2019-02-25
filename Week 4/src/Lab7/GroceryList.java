package Lab7;

import java.util.*;

public class GroceryList {
    
    public static void main(String[] args) {
        //Declaring ArrayList and other variables
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //Boolean to stop the loop when list is completed
        boolean end = false;
        //Loop to fill the array
        do {
            System.out.println("Enter an item in your grocery list: \nWhen finished, enter \"end\"");
            String item = in.nextLine();
            if (item.equals("end")) {
                end = true;
            }
            else {
                list.add(item);
            }
        }while (end == false);
        System.out.println("Your grocery list is: \n" + list);
        //Triger to exit the loop when needed
        boolean stop = false;
        //Loop to manipulate the list
        do{
            System.out.println("What do you want to do with your list?\n1 - add item\n2 - remove item(enter index)\n3 - search item\n4 - change item\n5 - remove item(enter name of the item)\n6 - remove item and show the removed item(enter name of the item)\n7 - do nothing");
            int action = in.nextInt();
            switch (action) {
                case 1:
                    System.out.println("What do you want to add?");
                    in.nextLine();
                    String item1 = in.nextLine();
                    System.out.println("New list: " + addItem(item1,list));
                    break;
                case 2:
                    System.out.println("What item do you want to remove?\nEnter position: ");
                    int index = in.nextInt() - 1;
                    removeItem(index, list);
                    System.out.println("New list: " + list);
                    break;
                case 3:
                    System.out.println("Search item: ");
                    in.nextLine();
                    String item2 = in.nextLine();
                    if(searchItem(item2,list) == true) {
                        System.out.println("The item is in your list");
                }
                    else {
                        System.out.println("Item is not in your list");
                }
                    break;
                case 4:
                    System.out.println("Enter the position of the item you want to change: ");
                    int index2 = in.nextInt() - 1;
                    System.out.println("What do you want to change it to?");
                    in.nextLine();
                    String name = in.nextLine();
                    changeItem(index2,name,list);
                    System.out.println("New list: " + list);
                    break;
                case 5:
                    System.out.println("Name of the item you want to remove?");
                    in.nextLine();
                    String item3 = in.nextLine();
                    if (removeItem2(item3,list) == true) {
                        System.out.println("The item was removed!\nNew list: " + list);
                    }
                    else {
                        System.out.println("The item was not in the list!");
                    }
                    break;
                case 6:
                    System.out.println("Enter the item you want to remove: ");
                    in.nextLine();
                    String item4 = in.nextLine();
                    System.out.println("Item removed - " + removeItem3(item4,list));
                    break;
                case 7:
                    System.out.println("Final list: " + list);
                    stop = true;
                    break;
                default:
                    System.out.println("Error! Please enter the correct number!");
                    break;
            }
        }while(stop != true);
    }
    public static ArrayList<String> addItem(String item1, ArrayList<String> list) {
        list.add(item1);
        return list;
    }
    public static ArrayList<String> removeItem(int index,ArrayList<String> list) {
        list.remove(index);
        return list;
    }
    public static boolean searchItem(String item2,ArrayList<String> list) {
        boolean found = false;
        for(String name : list) {
            if(item2.equals(name)) {
                found = true;
            }
        }
        return found;
    }
    public static ArrayList<String> changeItem(int index,String name, ArrayList<String> list) {
        list.set(index, name);
        return list;
    }
    public static boolean removeItem2(String item, ArrayList<String> list) {
        boolean removed = false;
        for(String name : list) {
            if(name.equals(item)) {
                list.remove(list.indexOf(name));
                removed = true;
            }
        }
        return removed;
    }
    public static String removeItem3(String item4,ArrayList<String> list) {
        String removed = "Error! Item not found!";
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(item4)) {
                removed = list.get(i);
                list.remove(list.indexOf(list.get(i)));
            }
        }
        return removed;
    }
}