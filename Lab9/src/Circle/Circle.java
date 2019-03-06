package Circle;

/**
 * A mode of a circle
 * @author Vladimir Bardadom
 * @version 1.0 25/03/2019
 */

public class Circle {
    
    /**
     * The radius of the circle 
     */
    private double radius;
    
    /**
     * The constructor for the circle objects
     * @param aRadius The radius of the circle
     */
    public Circle(double aRadius) {
        radius = aRadius;
    }
    
    //---------------Getter Methods------------------
    
    /**
     * Gets the radius of the circle
     * @return The radius of the corcle
     */
    public double getRadius() {
        return radius;
    }
    
    //----------------Setter Methods-----------------
    
    /**
     * Sets the radius of the circle
     * @param aRadius Radius of the circle
     */
    public void setRadius(double aRadius) {
        radius = aRadius;
    }
    
    //----------------Other Methods-----------------
    
    /**
     * Calculates the area of the circle
     * @return Area of the circle
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calculates the circumference of the circle
     * @return Circumference of the circle
     */
    public double calculateC() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * toString method
     * @return The information contained in the fields
     */
    public String toString() {
        String str = "Radius is " + getRadius() + " , Area is " + calculateArea() + " and Circumference is " + calculateC();
        return str;
    }
    
} //End of class