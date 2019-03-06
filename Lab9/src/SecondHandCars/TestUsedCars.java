package SecondHandCars;


/**
 * Test class for UsedCars class
 * @author Vladimir Bardadom
 * @version 1.0 25/03/2019
 */

public class TestUsedCars {
    
    public static void main(String[] args) {
        
        //Create an instance of UsedCar
        //With make BMW, Model X5, License number 082 BHL, Mileage 586, Fuel Type petrol
        UsedCar car1 = new UsedCar("BMW","X5","Black","228 MEH", 586, "Diesel");
        
        //Test the getters
        System.out.println("Make is " + car1.getMake());
        System.out.println("Model is " + car1.getModel());
        System.out.println("Color is " + car1.getColor());
        System.out.println("License number is " + car1.getLicense());
        System.out.println("Mileage is " + car1.getMileage());
        System.out.println("Fuel type is " + car1.getFuel());
        
        //Test the setters
        car1.setMake("Toyota");
        System.out.println("Make is " + car1.getMake());
        car1.setModel("Yaris");
        System.out.println("Make is " + car1.getModel());
        car1.setColor("Red");
        System.out.println("Color is " + car1.getColor());
        car1.setLicense("826 BHL");
        System.out.println("License number is " + car1.getLicense());
        car1.setMileage(1438.88);
        System.out.println("Mileage is " + car1.getMileage());
        car1.setFuel("Petrol");
        System.out.println("Fuel type is " + car1.getFuel());
        
        //Test toString method
        System.out.println(car1.toString());
    }
}