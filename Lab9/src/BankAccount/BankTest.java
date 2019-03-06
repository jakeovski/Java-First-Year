package BankAccount;


/**
 * Test class for BankAccount class
 * @author Vladimir Bardadom
 * @version 1.0 26/03/2019
 */

public class BankTest {
    
    public static void main(String[] args) {
        
        //Creating instance of BankAccount
        BankAccount user1 = new BankAccount("Bogdan");
        
        //Testing getters
        System.out.println("Your name is " + user1.getName());
        System.out.println("Your balance is " + user1.getBalance());
        
        //Testing setters 
        user1.setName("Ilya");
        System.out.println("Your name is " + user1.getName());
        user1.setBalance(100);
        System.out.println("Your balance is " + user1.getBalance());
        
        //Testing toString method
        System.out.println(user1.toString());
        
        //Testing deposit method
        System.out.println(user1.deposit(400));
        
        //Testing withdraw method
        System.out.println(user1.withdraw(770));
        System.out.println(user1.toString());
        
        //Testing interest method
        System.out.println("This amount will be deducted next year - " + user1.addInterest(5));
               
    }
}