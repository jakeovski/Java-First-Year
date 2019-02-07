
package lab3;

/**
 *
 * @author 1807132
 */
public class DiceRoll {

    public static void main(String[] args) {
        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        System.out.println("Your first die comes up with " + firstDice);
        System.out.println("Your second die comes up with " + secondDice);
        System.out.println("Your total roll is " + (firstDice + secondDice));
    }  
}
