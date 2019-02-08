public class RollsTill12 {
    
    public static void main(String[] args) {
        int attempts = 0;
        int total = 0;
        do {
            int firstDice = (int)(Math.random() * 6) + 1;
            int secondDice = (int)(Math.random() * 6) + 1;
            System.out.println("First dice rolled with :" + firstDice + "\nSecond dice rolled with " + secondDice);
            total = firstDice + secondDice;
            System.out.println("Total number on the pair of dices: " + total);
            attempts++;
        } while (total != 12);
        System.out.println(attempts + " attempts was needed to get the total number of 12 on both dices.");
    }
}