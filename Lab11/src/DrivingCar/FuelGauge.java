package DrivingCar;


/**
 * A model of car's Fuel Gauge
 * @author Vladimir Bardadom
 * @version 1.0 10/03/2019
 */

public class FuelGauge {
 
 /**
  * The amount of fuel
  */
 private double fuel;
 
 /**
  * Default Constructor
  */
 public FuelGauge() {
     fuel = 0;
}
 
 /**
  * Parametric Constructor
  * @param aFuel The amount of fuel
  */
 public FuelGauge(double aFuel){
     fuel = aFuel;
 }
 
 //------------Getter Method----------------

    /**
     * Gets the fuel
     * @return Fuel
     */
    public double getFuel() {
        return fuel;
    }
 
 //------------Setter Methods---------------

    /**
     * Sets the amount of fuel
     * @param fuel The amount of fuel
     */
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
//-------------Other Methods----------------
    
    /**
     * Report of the current amount of fuel
     * @return 
     */
    public String toString() {
        return "Current amount of fuel: " + getFuel() + " litres";
    }
    
    /**
     * This method simulates filling the fuel tank
     */
    public void fill() {
        if (fuel < 40) {
            fuel++;
        }
        else {
            System.out.println("The tank is full!");
        }
    }
    
    public void decreaseFuel() {
        if (fuel > 0) {
            fuel--;
        }
        else if (fuel == 0)
            System.out.println("Out of fuel!");
        }
    }