import java.util.Scanner;

public class RaceTheComputer {
    
    public static void main(String[] args) {
        int again = 0;
        do{
            game();
            System.out.println("Do you want to play again?\nYes - 1\nNo - 2");
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            if (input == 2) {
                again = 1;
            }
        } while (again == 0);
    }
    public static void game() {
        //Declaring some variables
        int player = 0;
        int computer = 0;
        Scanner in = new Scanner(System.in);
        //Doing big do while loop for each turn
        do {
            int check = 0;
            //Doing a loop asking players to throw a dice
            do {
                System.out.print("Press 1 to throw the dice:\n");
                int f = in.nextInt();
                if ( f == 1) {
                    check++;
                }
            } while (check == 0);
            //Showing results
            int playerDice = (int)(Math.random() * 6) + 1;
            int computerDice = (int)(Math.random() * 6) + 1;
            System.out.println("You rolled " + playerDice);
            System.out.println("The computer rolled " + computerDice);
            player += playerDice;
            computer += computerDice;
            System.out.println("Your total score: " + player + "\nComputer's score: " + computer);
            if (computer >= 30 && player >= 30) {
            System.out.println("It's a draw!");
            }
            else if (computer >= 30) {
            System.out.println("Defeat. The computer has won.");
            }
            else if (player >= 30) {
            System.out.println("Congratulations! You won!");
            }
        } while (player < 30 && computer < 30);
}
}
