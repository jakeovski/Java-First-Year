package Oblong;

/**
 * A model of an oblong
 * @author Vladimir Bardadom
 * @version 1.0 25/03/2019
 */
public class Oblong {
    /**
     * The length of the rectangle
     */
    private double length;
    
    /**
     * The width of the rectangle
     */
    private double width;
    
    /**
     * The constructor for the oblong objects
     * @param aLength The length of the rectangle
     * @param aWidth The width of the rectangle
     */
    public Oblong(double aLength, double aWidth) {
        length = aLength;
        width = aWidth;
    }
    //------------Getter Methods----------------
    /**
     * Gets the length
     * @return The length of the rectangle
     */
    public double getLength() {
        return length;
    }
    /**
     * Gets the width
     * @return The width of the rectangle
     */
    public double getWidth() {
        return width;
    }
    //-----------Setter Methods-----------------
    /**
     * Sets the length
     * @param aLength The length of the rectangle
     */
    public void setLength(double aLength) {
        length = aLength;
    }
    public void setWidth(double aWidth) {
        width = aWidth;
    }
    //----------Other Methods-------------------
    
    /**
     * Calculates the area
     * @return The area of the ractangle
     */
    public double calculateArea(){
        return length * width;
    }
    
    /**
     * Calculates the perimeter
     * @return The perimeter of the rectangle
     */
    public double calculatePerimeter() {
        return (length + width) * 2;
    }
    
    /**
     * ToString Method
     * @return The information contained in the fields
     */
    public String toString() {
        String str = "Length is " + getLength() + " , Width is " + getWidth() + " , Perimeter is " + calculatePerimeter() + " and Area is " + calculateArea();
        return str;
    }
    
}   //End of class
