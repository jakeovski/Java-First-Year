
import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    
    public static void main(String[] args) {
        int[] winTicket = winTicket();
        int[] userTicket = userTicket();
        System.out.println(Arrays.toString(winTicket));
        System.out.println(Arrays.toString(userTicket));
        int winCount = winCheck(winTicket,userTicket);
        if (winCount == 6 ) {
            System.out.println("Congratulations! You have won the lottery!\nCorrect numbers: " + winCount + " out of 6" );
        }
        else {
            System.out.println("Almost here. You have got " + winCount + " out of 6 numbers");
        }
    }
    public static int[] winTicket() {
        int[] winTicket = new int[6];
        int i = 0;
        while (i < winTicket.length) {
            int newNum = (int)(Math.random() * 50) + 1;
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (winTicket[j] == newNum) {
                    flag = true;
                }
            }
            if (!flag) {
                winTicket[i] = newNum;
                i++;
            }
        }
        Arrays.sort(winTicket);
        return winTicket;
    }
    public static int[] userTicket() {
        int[] userTicket = new int[6];
        int k = 0;
        Scanner in = new Scanner(System.in);
        while (k < userTicket.length) {
            boolean flag = false;
            System.out.print("Enter a number between 1 and 50: ");
            int newNum = in.nextInt();
            if (newNum > 0 && newNum < 51) {
                for (int j = 0; j < k;j++) {
                    if (userTicket[j] == newNum) {
                        flag = true;
                    }
                }
                if (!flag) {
                    userTicket[k] = newNum;
                    k++;
                }
                else {
                    System.out.println("You have already entered that number!");
                }
            }
            else {
                System.out.println("The number is out of range!");
            }
        }
        Arrays.sort(userTicket);
        return userTicket;
    }
    public static int winCheck(int[] winTicket, int[] userTicket) {
        int winCount = 0;
        for (int i = 0; i < winTicket.length; i++) {
            for (int k = 0; k < winTicket.length; k++) {
                if (userTicket[i] == winTicket[k]) {
                    winCount++;
                }
            }
        }
        return winCount;
    } 
}