package Room;



/**
 * A model of a room
 * @author Vladimir Bardadom
 * @version 1.0 25/03/2019
 */

public class Room {
    
    /**
     * The number of the room
     */
    private int number;
    
    /**
     * The length of the room
     */
    private double length;
    
    /**
     * The breadth of the room
     */
    private double breadth;
    
    /**
     * The heigth of the room
     */
    private double height;
    
    /**
     * The number of occupants
     */
    private int occupants;
    
    /**
     * The constructor for a room
     * @param num Room number
     * @param aLength Length of the room
     * @param aBreadth Breadth of the room
     * @param aHeight Height of the room
     * @param aOccupants Number of occupants in the room
     */
    public Room(int num, double aLength, double aBreadth, double aHeight,int aOccupants) {
        number = num;
        length = aLength;
        breadth = aBreadth;
        height = aHeight;
        occupants = aOccupants;
    }
    
    
    //-----------------Getter Methods-----------------
    
    /**
     * Gets number of the room
     * @return Number of the room
     */
    public int getNum() {
        return number;
    }
    
    /**
     * Gets length of the room
     * @return Length of the room
     */
    public double getLength() {
        return length;
    }
    
    /**
     * Gets breadth of the room
     * @return Breadth of the room
     */
    public double getBreadth() {
        return breadth;
    }
    
    /**
     * Gets heigth of the room
     * @return Height of the room
     */
    public double getHeigth() {
        return height;
    }
    
    /**
     * Gets number of occupants in the room
     * @return Number of occpuants in the room
     */
    public int getOccupants() {
        return occupants;
    }
    
    //----------------Setter Methods----------------
    
    /**
     * Sets the room number
     * @param num Number of the room
     */
    public void setNum(int num){
        number = num;
    }
    
    /**
     * Sets the room length
     * @param aLength Length of the room
     */
    public void setLength(double aLength){
        length = aLength;
    }
    
    /**
     * Sets the breadth of the room
     * @param aBreadth Breadth of the room
     */
    public void setBreadth(double aBreadth) {
        breadth = aBreadth;
    }
    
    /**
     * Sets the height of the room
     * @param aHeight Height of the room
     */
    public void setHeight(double aHeight) {
        height = aHeight;
    }
    
    /**
     * Sets the number of occupants in the room
     * @param aOccupants Number of the occupants
     */
    public void setOccupants(int aOccupants) {
        occupants = aOccupants;
    }
    
    //----------------Other Methods------------------
    
    /**
     * Calculates the volume of the room
     * @return Volume of the room
     */
    public double roomVolume() {
        return length * breadth * height;
    }
    
    /**
     * Calculates the floor space of the room
     * @return Floor space of the room
     */
    public double floorSpace() {
        return length * breadth;
    }
    
    /**
     * Calculates floor space per occupant
     * @return floor space per occupant
     */
    public double spacePerOccupant() {
        return (length*breadth)/occupants;
    }
    
    /**
     * toString method
     * @return information contained in the fields
     */
    public String toString() {
        String str = "Room " + getNum() + ":\nLength: " + getLength() + "\nBreadth: " + getBreadth() + "\nHeight: " + getHeigth() + "\nNumber of occupants: " + getOccupants() + "\nVolume of the room: " + roomVolume() + "\nFloor space: " + floorSpace() + "\nFloor Space per occupant: " + spacePerOccupant();
        return str;
    }
    
    /**
     * Calculation carpeting cost with a price of 13.99 per square meter
     * @return Carpeting cost
     */
    public double carpetCost() {
        return floorSpace() * 13.99;
    }
//End of the class
}