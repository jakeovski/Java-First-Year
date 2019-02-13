
import java.util.Scanner;

public class SimpleGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        final int sizeX = 10;
        final int sizeY = 10;
        boolean found = false;

        // player starts in middle of grid
        System.out.println("Player starts at (5, 5)");
        int playerX = 5;
        int playerY = 5;
        // determine position of prize
        //int prizeX = 1;
        //int prizeY = 7;
        int prizeX = (int) (Math.random() * sizeX) + 1;
        int prizeY = (int) (Math.random() * sizeY) + 1;

        // Output prize location while debugging
        //System.out.println("Prize is at (" + prizeX + ", " + prizeY + ")");
        // loop to ask the user for a direction
        while (!found) {
            // get input from user
            System.out.println("Input a direction using a,s,d,w \n");
            char inputChar = in.next().toLowerCase().charAt(0);
            // change the player position
            //switch on the input character
            switch (inputChar) {
                // UP
                case 'w':
                    // if a move upwards is in bounds, move up
                    // else output that the move is not possible.
                    if (playerY < 10) {
                        playerY++;
                    } else {
                        System.out.println("You can not move UP!!");
                    }
                    break;

                case 's':
                    // if a move down is in bounds, move down
                    // else output that the move is not possible.
                    if (playerY > 1) {
                        playerY--;
                    } else {
                        System.out.println("You can not move DOWN!!");
                    }
                    break;
                    case 'a':
                    // if a move left is in bounds, move left
// else output that the move is not possible.
                    if (playerX > 1) {
                        playerX--;
                    } else {
                        System.out.println("You can not move LEFT!!");
                    }
                    break;
                case 'd':
                    // if a move right is in bounds, move right
                    // else output that the move is not possible.
                    if (playerX < 10) {
                        playerX++;
                    } else {
                        System.out.println("You can not move RIGHT!!");
                    }
                    break;
                default:
                    System.out.println("Not a valid direction");
            }
            // give feedback to the player
            if (feedback(playerX,playerY,prizeX,prizeY) == true) {
                found = true;
            }
        }
    }
    public static boolean feedback(int playerX,int playerY,int prizeX,int prizeY) {
	System.out.println("New position is (" + playerX
                    + ", " + playerY + ")");
        int distanceToPrize = Math.max(Math.abs(prizeX - playerX), Math.abs(prizeY - playerY));
        if (distanceToPrize == 0) {
            // register that the prize has been found
            // and out a message to that effect
            System.out.println("Hurrah! Game over");
            return true;
        } else if (distanceToPrize == 1) {
            System.out.println("Boiling");
            return false;
        } else if (distanceToPrize == 2) {
            System.out.println("Hot");
            return false;
        } else if (distanceToPrize == 3) {
            System.out.println("Warm");
            return false;
        } else {
            System.out.println("Cold");
            return false;
        }
}
}
