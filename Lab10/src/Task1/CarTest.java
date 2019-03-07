package Task1;


/**
 * Test class for Car class
 * @author Vladimir Bardadom
 * @version 1.0 07/03/2019
 */

public class CarTest {
    
    public static void main(String[] args) {
        
        //Creating an instance of the class
        Car car1 = new Car("Bogdan", "Lada" , 40000, true);
        
        //Testing getters
        System.out.println("Owner: " + car1.getOwner());
        System.out.println("Make : " + car1.getMake());
        System.out.println("Mileage " + car1.getMileage());
        System.out.println("Petrol: " + car1.isIsPetrol());
        
        //Testing the setters
        car1.setOwner("Zanuda");
        System.out.println("Owner: " + car1.getOwner());
        car1.setMake("Toyota");
        System.out.println("Make : " + car1.getMake());
        car1.setMileage(77999);
        System.out.println("Mileage " + car1.getMileage());
        car1.setIsPetrol(true);
        System.out.println("Petrol: " + car1.isIsPetrol());
        
        //Test for classification method
        System.out.println(car1.classification());
        
        //Test for replacement method
        System.out.println(car1.replacement());
        
        //Test for displayWarning method
        System.out.println(car1.displayWarning());
        
        //Test for toString method
        System.out.println(car1.toString());
    }
}