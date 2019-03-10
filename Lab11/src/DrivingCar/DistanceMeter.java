package DrivingCar;


/**
 * A model of odometer in the car 
 * @author Vladimir Bardadom
 * @version 1.0 10/03/2019
 */

public class DistanceMeter {
    
    /**
     * Mileage of the car
     */
    private double mileage;

    /**
     * Constructor for the DistanceMeter
     */
    public DistanceMeter() {
        mileage = 0;
    }
    
    //-------------Getter Method-----------

    /**
     * Gets mileage of the car
     * @return Mileage of the car
     */
    public double getMileage() {
        return mileage;
    }
    
    //--------------Setter Method-------------

    /**
     * Sets the mileage of the car
     * @param mileage Mileage of the car
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    //-----------Other Method---------------
    
    /**
     * Reports on car's current mileage
     * @return Information in the fields
     */
    public String toString() {
        return "Current mileage: " + getMileage() + " miles";
    }
    
    public void mileageUp() {
        if (mileage < 999999){
            mileage++;
        }
        else {
            mileage = 0;
        }
    }  
    public void drive(FuelGauge fuel) {
        if (mileage % 10 == 0) {
            fuel.decreaseFuel();
        }
    }
}