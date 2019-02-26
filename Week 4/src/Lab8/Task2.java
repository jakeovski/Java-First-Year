package Lab8;

import java.util.*;

public class Task2 {
    
    public static void main(String[] args) {
        int[][] arr = {
            {3,-5,8,-2,7},
            {4,8,-3,2,-8},
            {-5,8,-9,4,6},
            {1,-6,3,9,-11},
            {6,8,-3,-5,8}
        };
        //System.out.println(Arrays.deepToString(arr));
        for (int[] a : arr ) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The sum of row " + (i +1) + " is " + rowSum(arr,i));
        }
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println("The sum of column " + (i + 1) + " is " + colSum(arr,i));
        }
    }
    public static int rowSum(int[][] arr , int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length;i++) {
            sum += arr[row][i];
        }
        return sum;
    }
    public static int colSum(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }
}