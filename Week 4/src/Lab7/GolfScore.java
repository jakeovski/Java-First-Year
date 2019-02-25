package Lab7;

import java.util.*;


public class GolfScore {
    public static void main(String[] args) {
        //Declaring variables
        ArrayList <Integer> score = new ArrayList<>();
        boolean stop = false;
        do {
            //Input and check for a positive value and stop value
            Scanner in = new Scanner(System.in);
            System.out.println("Please input the golf score: \nIf you want to stop enter - -1");
            int input = in.nextInt();
            if(input >= 0) {
                score.add(input);
            }
            else if (input == -1){
                stop = true;
            }
            else {
                System.out.println("The score should be more than or equal to 0");
            }
        }while (stop == false);
        //Test
        System.out.println(score);
        System.out.println("Maximum value is " + max(score));
        System.out.println("Minimum value is " + min(score));
        System.out.println("Average is " + average(score));
    }
    public static int max(ArrayList<Integer> score){
        int max = 0;
        for(int i = 0; i < score.size(); i++){
            if(score.get(i) > max) {
                max = score.get(i);
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> score) {
        int min = score.get(0);
        for(int i = 0; i < score.size(); i++) {
            if(score.get(i) < min) {
                min = score.get(i);
            }
        }
        return min;
    }
    public static int average(ArrayList<Integer> score) {
        int average = 0;
        for(Integer value : score) {
            average += value;
        }
        average /= score.size();
        return average;
    }
}
        
        
