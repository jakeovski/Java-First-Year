package Lab8;

import java.util.*;

public class Task1 {
    
    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        System.out.println("How many rows you want to create?");
        int row = in.nextInt();
        System.out.println("How many columns you want to create?");
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        //Filling the array
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number: ");
                arr[i][j] = in.nextInt();
            }
        }
        //Displaying the array
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
        //System.out.println(Arrays.deepToString(arr));
    }
}