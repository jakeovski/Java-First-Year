package Lab8;

import java.util.*;

public class Task3 {
    
    public static void main(String[] args) {
        int[] numArray = new int[5];
        boolean[] seenNumbers = new boolean[5];
        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = (int)Math.floor(Math.random() * 5);
        }
        for (int i = 0; i < seenNumbers.length; i++) {
            for(int num : numArray) {
                if (num == i) {
                    seenNumbers[i] = true;
                }
            }
        }
        System.out.println(Arrays.toString(numArray));
        System.out.println(Arrays.toString(seenNumbers));
        if (eachNum(numArray,seenNumbers) == true) {
            System.out.println("Each number occurs in numArray!");
        }
    }
    public static boolean eachNum(int[] numArray,boolean[] seenNumbers) {
        int result = 0;
        for (boolean num : seenNumbers) {
            if(num == true) {
                result++;
            }
        }
        if (result == 5) {
            return true;
        }
        else {
            return false;
        }
    }
}