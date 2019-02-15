import java.util.Arrays;

public class Q7 {
    
    public static void main(String[] args) {
        int[] randomInt = new int[10];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int)(Math.random() * 20) + 1;
        }
        System.out.println(Arrays.toString(randomInt));
        System.out.println("The difference betweem largest and the smallest number is " + difference(randomInt));
        System.out.println("Number of even numbers: " + even(randomInt));
        System.out.println("Numbers greater than 14: " + greaterThan14(randomInt));
        System.out.println("Numbers less than 5: " + lessThan5(randomInt));
    } 
    public static int difference(int[] randomInt){
        int max = randomInt[0];
        for (int element : randomInt) {
            if (element > max) {
                max = element;
            }
        }
        int min = randomInt[0];
        for(int element : randomInt) {
            if (element < min) {
                min = element;
            }
        }
        int difference = max - min;
        return difference;
    }
    public static int even(int[] randomInt) {
        int even = 0;
        for (int i = 0; i < randomInt.length;i++) {
            if(randomInt[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }
    public static int greaterThan14 (int[] randomInt) {
        int greater = 0;
        for(int i = 0; i < randomInt.length; i ++) {
            if (randomInt[i] > 14) {
                greater++;
            }
        }
        return greater;
    }
    public static int lessThan5(int[] randomInt) {
        int less = 0;
        for(int i = 0; i < randomInt.length; i++) {
            if (randomInt[i] < 5) {
                less++;
            }
        }
        return less;
    }
}