package SecondHandCars;


/**
 * A model to track used cars
 * @author Vladimir Bardadom
 * @version 1.0 25/03/2019
 */

public class UsedCar {
    
    /**
     * Car's make
     */
    private String make;
    
    /**
     * Car's model
     */
    private String model;
    
    /**
     * Car's color
     */
    private String color;
    
    /**
     * Car's license number
     */
    private String license;
    
    /**
     * Car's mileage
     */
    private double mileage;
    
    /**
     * Car's fuel type
     */
    private String fuel;
    
    /**
     * The constructor for a used car
     * @param aMake Make of the car
     * @param aModel Model of the car
     * @param aColor Color of the car
     * @param aLicense License of the car
     * @param aMileage Mileage of the car
     * @param aFuel Fuel type of the car
     */
    public UsedCar(String aMake, String aModel, String aColor, String aLicense, double aMileage, String aFuel) {
        make = aMake;
        model = aModel;
        color = aColor;
        license = aLicense;
        mileage = aMileage;
        fuel = aFuel;
    }
    
    //------------------Getter Methods---------------------
    
    /**
     * Gets the make of the car
     * @return The make of the car
     */
    public String getMake() {
        return make;
    }
    
    /**
     * Gets model of the car
     * @return Model of the car
     */
    public String getModel() {
        return model;
    }
    
    /**
     * Gets color of the car
     * @return Color of the car
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Gets license number of the car
     * @return License number of the car
     */
    public String getLicense() {
        return license;
    }
    
    /**
     * Gets the mileage of the car
     * @return Car's mileage
     */
    public double getMileage() {
        return mileage;
    }
    
    /**
     * Gets car's fuel type 
     * @return Car's fuel type
     */
    public String getFuel() {
        return fuel;
    }
    
    //----------------Setter Methods------------------
    
    /**
     * Sets the make of the car
     * @param aMake Make of the car
     */
    public void setMake(String aMake) {
        make = aMake;
    }
    
    /**
     * Sets model of the car
     * @param aModel Model of the car
     */
    public void setModel(String aModel) {
        model = aModel;
    }
    
    /**
     * Sets color of the car
     * @param aColor Color of the car
     */
    public void setColor(String aColor) {
        color = aColor;
    }
    
    /**
     * Sets license number of the car
     * @param aLicense License number of the car
     */
    public void setLicense(String aLicense) {
        license = aLicense;
    }
    
    /**
     * Sets mileage of the car
     * @param aMileage Mileage of the car
     */
    public void setMileage(double aMileage) {
        mileage = aMileage;
    }
    
    /**
     * Set fuel type of the car
     * @param aFuel Fuel type of the car
     */
    public void setFuel(String aFuel) {
        fuel = aFuel;
    }
    
    //-------------Other Methods-----------------
    
    public String toString() {
        String str = "Cars Specifications:\nMake: " + getMake() + "\nModel: " + getModel() + "\nColor: " + getColor() + "\nLecense number: " + getLicense() + "\nMileage: " + getMileage() + "\nFuel type: " + getFuel();
        return str;
    }
    //End of class
}