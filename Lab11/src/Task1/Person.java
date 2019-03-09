package Task1;


/**
 * A model of a person
 * @author Vladimir Bardadom
 * @version 1.0 09/03/2019
 */

public class Person {
    
    /**
     * First name of the person
     */
    private String firstName;
    
    /**
     * Last name of the person
     */
    private String lastName;
    
    /**
     * Age of the person
     */
    private int age;
    
    /**
     * Whether they have car insuarance
     */
    private boolean carInsurance;
    
    /**
     * Constructor for the person class;
     * @param firstName First name of the person
     * @param lastName Last name of the person
     * @param age Age of the person
     * @param carInsurance Whether the person has insuarance number
     */
    public Person(String firstName,String lastName,int age,boolean carInsurance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.carInsurance = carInsurance;
    }
    
    //--------Getter Methods-------------

    /**
     * Gets the first name of the person
     * @return First name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name of the person
     * @return Last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets age of the person
     * @return Age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets whether the person has insurance number or not
     * @return true if person has car insurance , false if not
     */
    public boolean isCarInsurance() {
        return carInsurance;
    }
    
    //-----------Setter Methods----------------

    /**
     * Sets the first name of the person
     * @param firstName First name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets last name of the person
     * @param lastName Last name of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets age of the person
     * @param age Age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets whether the person has car insurance or not
     * @param carInsurance True if person has car insurance, false if not
     */
    public void setCarInsurance(boolean carInsurance) {
        this.carInsurance = carInsurance;
    }
    
    //--------------Other methods------------------
     
    public String toString() {
        return "First name: " + getFirstName() + "\nLast name: " + getLastName() + "\nAge: " + getAge() + "\nCar Insurance: " + isCarInsurance();
    }
}