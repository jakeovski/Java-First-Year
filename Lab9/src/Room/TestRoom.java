package Room;



/**
 * Test class for Room class
 * @author Vladimir Bardadom
 * @version 1.0 25/03/2019
 */

public class TestRoom {
    
    public static void main(String[] args) {
        
        //Creating a Room
        //With room number 101, length 10, breadth 6, height 4,number of occupants 3
        Room rm1 = new Room(101,10,6,4,3);
        
        //Test for getters
        System.out.println("Room number is " + rm1.getNum());
        System.out.println("Length is " + rm1.getLength());
        System.out.println("Breadth is " + rm1.getBreadth());
        System.out.println("Heigth is " + rm1.getHeigth());
        System.out.println("Number of occupants " + rm1.getOccupants());
        
        //Test for setters
        rm1.setNum(38);
        System.out.println("Room number is " + rm1.getNum());
        rm1.setLength(4.7);
        System.out.println("Length is " + rm1.getLength());
        rm1.setBreadth(3.4);
        System.out.println("Breadth is " + rm1.getBreadth());
        rm1.setHeight(3);
        System.out.println("Heigth is " + rm1.getHeigth());
        rm1.setOccupants(2);
        System.out.println("Number of occupants " + rm1.getOccupants());
        
        //Test for roomVolume method
        System.out.println("Room volume is " + rm1.roomVolume());
        
        //Test for floorSpace method
        System.out.println("Room's floor space is " + rm1.floorSpace());
        
        //Test for spacePerOccupant method
        System.out.println("Floor space per occupant is " + rm1.spacePerOccupant());
        
        //Test for toString method
        System.out.println(rm1.toString());
        
        //Test for carpetCost method
        System.out.println("The cost of carpeting at 13.99$ per square meter is " + rm1.carpetCost());
    }
    
    
}