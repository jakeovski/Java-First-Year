package lab3;
import java.util.Scanner;


public class ComputerOrder {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double computer = 300;
        System.out.print("Please input the number of computers you want to purchase:\n ");
        int num = in.nextInt();
        double discounted = 0;
        if (num >= 20 && num < 50) {
            discounted = computer - (computer * 0.1);
        }
        else if (num >= 50) {
            discounted = computer - (computer * 0.2);
        }
        else {
            discounted = computer;
        }
        double price = discounted * num;
        System.out.print("Do you need an express delivery?\nEnter 1 - if yes\nEnter 2 - if no\n");
        int express = in.nextInt();
        switch (express) {
            case 1:
                {
                    double delivery = discounted * 7.50;
                    double finalPrice = price + delivery;
                    System.out.println("You want to buy " + num + " computers\nPrice for a computer without discount: " + computer + "$\nPrice for a computer with a discount: " + discounted + "$\nDelivery: " + delivery + "$\nFinal price: " + finalPrice + "$");
                    break;
                }
            case 2:
                {
                    double delivery = computer * 0;
                    double finalPrice = price + delivery;
                    System.out.println("You want to buy " + num + " computers\nPrice for a computer without discount: " + computer + "$\nPrice for a computer with a discount: " + discounted + "$\nDelivery: " + delivery + "$\nFinal price: " + finalPrice + "$");
                    break;
                }
            default:
                System.out.print("Error!\nYou have entered the wrong number! Try again next time!");
                break;
        }
    }  
}