import java.util.Scanner;

public class Room101 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Please enter the length: ");
       double length = in.nextDouble();
       System.out.println("Please enter the breadth: ");
       double breadth = in.nextDouble();
       System.out.println("Please enter the height: ");
       double height = in.nextDouble();
       double area = area(length, breadth);
       System.out.println("The area of the floor is " + area);
       double wallArea = wallArea(length,breadth,height);
       System.out.println("The total area of the walls is " + wallArea);
       double volume = volume(length,breadth,height);
       System.out.println("The volume of the room is " + volume);
       System.out.println("How much would you like to spend on carpeting?\nEnter the cost for a square meter: ");
       double costPerSqM = in.nextDouble();
       double carpetCost = carpetCost(length,breadth,costPerSqM);
       System.out.println("The cost of carpeting the room is " + carpetCost);
       System.out.println("How much would you like to spend on wall paint?\nEnter the cost for a square meter: ");
       costPerSqM = in.nextDouble();
       double wallPaintCost = wallPaintCost(length, breadth, height, costPerSqM);
       System.out.println("The cost of painting the walls is " + wallPaintCost);
       int numCarpetTiles = numCarpetTiles(length,breadth);
       System.out.println("The number of carpet tiles needed is " + numCarpetTiles);
       
       
       
       
       
   }
    public static double area(double length, double breadth) {
        return length * breadth;
    }
    public static double wallArea(double length, double breadth, double height) {
        return (length * height * 2) + (breadth * height * 2);
    }
    public static double volume(double length, double breadth, double height) {
        return area(length,breadth) * height;
    }
    public static double carpetCost(double length, double breadth, double costPerSqM) {
        return length * breadth * costPerSqM;
    }
    public static double wallPaintCost(double length,double breadth, double height, double costPerSqM){
        return wallArea(length, breadth, height) * costPerSqM;
    }
    public static int numCarpetTiles(double length, double breadth) {
        return ((int)area(length,breadth));
    }
}
