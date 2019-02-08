import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        //Declaring variables
        Scanner in = new Scanner(System.in);
        System.out.println("Let's start the game! The player draws two cards...");
        int firstCard = cardDraw();
        int secondCard = cardDraw();
        int total = firstCard + secondCard;
        int again = 0;
        System.out.println("The first card drawn is " + firstCard + "\nThe second card drawn is " + secondCard + "\nTotal score " + total );
        OUTER:
        //Do while loop for player to draw cards as much as he wants
        do {
            System.out.println("Do you want to draw another card?\nYes - 1\nNo - 2");
            int draw = in.nextInt();
            switch (draw) {
                case 1:
                    int card1 = cardDraw();
                    total += card1;
                    System.out.println("You have drawn " + card1 + "\nTotal score : " + total);
                    if (total > 21) {
                        System.out.println("Sorry. You have lost.");
                        break OUTER;
                    }
                    break;
                case 2:
                    again = 1;
                    break;
                default:
                    System.out.println("You have entered the wrong number!");
                    break OUTER;
            }
        } while (again != 1);
        //If player hasn't lost we start do while loop for the banker to draw his cards
        if (total <= 21 ) {
            System.out.println("Your total is " + total + "\nNow the banker draws his cards..");
            int bFirst = cardDraw();
            int bSecond = cardDraw();
            int bTotal = bFirst + bSecond;
            System.out.println("Banker's first card is " + bFirst + "\nBanker's second card is "+ bSecond + "\nBanker's total score is " + bTotal);
            do {
               System.out.println("Banker draws another card...");
               int bDraw = cardDraw();
               bTotal += bDraw;
               System.out.println("The banker draws " + bDraw + "\nBanker's total score is " + bTotal);
               if (bTotal > 21) {
                   System.out.println("The banker has lost. Congratulations!");
               }
            } while (bTotal <= 21 && bTotal < total);
            //Generating results
            System.out.println("Player's total score is " + total + "\nBanker's total score is " + bTotal);
            if (total == 21 || bTotal == 21) {
                System.out.println("BLACKJACK!!");
            }
            else if (total < bTotal && bTotal <= 21) {
                System.out.println("Defeat! The banker has won!");
            }
            else if (total == bTotal && total <= 21) {
                System.out.println("Unfortunately the banker has won!");
            }
            else if (total > bTotal && total <= 21) {
                System.out.println("Congratulations! The player has won!");
            }
        }
    }   
    public static int cardDraw() {
        //Simple method for card drawing
        int x = (int)(Math.random() * 10) + 1;
        return x;
    }
 }


