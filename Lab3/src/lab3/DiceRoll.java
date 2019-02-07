
package lab3;

/**
 *
 * @author 1807132
 */
public class DiceRoll {

    public static void main(String[] args) {
        int greater = 0;
        for(int i = 0; i < 10; i++) {
            int firstDice = (int)(Math.random() * 6) + 1;
            int secondDice = (int)(Math.random() * 6) + 1;
            System.out.println("Your first die comes up with " + firstDice);
            System.out.println("Your second die comes up with " + secondDice);
            System.out.println("Your total roll is " + (firstDice + secondDice));
            if ( firstDice > secondDice) {
                greater++;
            }
            System.out.println("First dice had a score greater than the second dice " + greater + " times.");       
        }   
    }
}
