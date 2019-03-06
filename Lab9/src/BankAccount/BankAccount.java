package BankAccount;


/**
 * A model of a customers bank account
 * @author Vladimir Bardadom
 * @version 1.0 26/04/2019
 */

public class BankAccount {
    
    /**
     * The name of the customer
     */
    private String customer;
    
    /**
     * The customer's balance
     */
    private double balance;
    
    
    private double overdraft;
    
    /**
     * The constructor for a BankAccount object
     * @param aCustomer 
     */
    public BankAccount(String aCustomer) {
        customer = aCustomer;
        balance = 0;
        overdraft = -200;
    }
    
    
    //----------------Getter Methods---------------
    
    /**
     * Gets customer's name
     * @return Customer's name
     */
    public String getName() {
        return customer;
    }
    
    /**
     * Gets customers balance on the account
     * @return The balance of the account
     */
    public double getBalance() {
        return balance;
    }
    
    //-----------------Setter methods--------------
    
    /**
     * Sets customer's name
     * @param aName Customer's name
     */
    public void setName(String aName) {
        customer = aName;
    }
    
    /**
     * Sets account's balance
     * @param aBalance Account's balance
     */
    public void setBalance(double aBalance) {
        balance = aBalance;
    }
    
    //----------------Other methods-------------------
    
    /**
     * Deposits money into the bank account
     * @param amount Amount to be deposited
     * @return String of a successful operation and showing new balance
     */
    public String deposit(double amount) {
        if (balance < 0) {
            balance += amount;
            balance -= 0.20;
        }
        else {
            balance += amount;
        }
        return "Operation successful, your new balance is " + balance;
    }
    
    /**
     * Withdraws money from bank account
     * @param amount The amount you want to withdraw
     * @return Message if the operation was succesful and showing new balance 
     */
    public String withdraw(double amount) {
        if (amount > 0) {
            double difference = balance - (overdraft);
            if (amount <= difference) {
                if (balance <= 0){
                    balance -= amount;
                    balance -= 0.2;
                    return "Withdrawal successful! Your new balance: " + balance;
                }
                else {
                    balance -= amount;
                    return "Withdrawal successful! Your new balance: " + balance;
                }
            }
            else {
                return "Error! Limit reached.";
            }
        }
        else {
            return "Error! Invalid number!";
        }
    }
    
    /**
     * Calculates interest
     * @param intr Interest rate
     * @return The amount that will be deducted next year
     */
    public double addInterest(double intr) {
        return balance * (intr/100);
    }
    
    /**
     * toString method
     * @return The information contained in the fields
     */
    public String toString() {
        String str = "Hello " + getName() + "\nYour balance: " + getBalance();
        return str;
    }
    //End of the class
}