/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrivingCar;

/**
 * A test class for FuelGage class and DistanceMeter
 * @author Pierre
 */
public class Drive {
    
    public static void main(String[] args) {
        
        //Creating instances of the objects
        
        FuelGauge tank1 = new FuelGauge();
        
        DistanceMeter meter1 = new DistanceMeter();
        
        //Test for fuel
        System.out.println(tank1.toString());
        
        //Test for mileage
        System.out.println(meter1.toString());
        
        System.out.println("Filling car...");
        for (int i = 0; i <= 40; i++) {
            tank1.fill();
        }
        System.out.println("Driving...");
        while(tank1.getFuel() != 0) {
            meter1.mileageUp();
            meter1.drive(tank1);
            if (meter1.getMileage() % 20 == 0) {
                System.out.println(meter1.toString() + "\n" + tank1.toString());
                if (tank1.getFuel() == 0) {
                    System.out.println("Out of fuel!");
                }
            }
        }
        
    }
}
