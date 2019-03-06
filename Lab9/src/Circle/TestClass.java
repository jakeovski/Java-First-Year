package Circle;


/**
 * A test class for Circle class
 * @author Vladimr Bardadom
 * @version 1.0 25/03/2019
 */
public class TestClass {
    
    public static void main(String[] args) {
        
        //Create an instance of Circle
        //With radius 3
        Circle c1 = new Circle(3);
        
        //Test the getters
        System.out.println("Radius is " + c1.getRadius());
        
        //Test the setters
        c1.setRadius(5);
        System.out.println("Radius is " + c1.getRadius());
        
        //Test the calculateArea method
        System.out.println("Area is " + c1.calculateArea());
        
        //Test the calculateC method
        System.out.println("Circumference is " + c1.calculateC());
        
        //Test toString method
        System.out.println(c1.toString());
    } //End of main method
} //End of Test Class