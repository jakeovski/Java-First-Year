package Task1;


/**
 * A model of the car
 * @author Vladimir Bardadom
 * @version 1.0 7/03/2019
 */

public class Car {
    
    /**
     * Owner of the car
     */
    private Person owner;
    
    /**
     * Make of the car
     */
    private String make;
    
    /**
     * Mileage of the car
     */
    private double mileage;
    
    /**
     * Uses petrol or diesel
     */
    private boolean isPetrol;

    
    /**
     * The constructor for the Car
     * @param aOwner Owner of the car
     * @param aMake Make of the car
     * @param aMileage Mileage of the car
     * @param aIsPetrol True if petrol, false if diesel
     */
    public Car(Person aOwner, String aMake, double aMileage, boolean aIsPetrol) {
        owner = aOwner;
        make = aMake;
        mileage = aMileage;
        isPetrol = aIsPetrol;
    }

    //----------------------Getter Methods----------------------------
    
    /**
     * Gets owner of the car
     * @return Owner of the car
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Gets make of the car
     * @return Make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets mileage of the car
     * @return Mileage of the car
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * Gets whether the car is petrol or diesel
     * @return true if petrol, false if diesel
     */
    public boolean isIsPetrol() {
        return isPetrol;
    }

    //--------------------------Setter Methods-----------------------
    
    /**
     * Sets owner of the car
     * @param owner Owner of the car
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Sets make of the car
     * @param make Make of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Sets mileage of the car
     * @param mileage Mileage of the car
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * Sets if the car is petrol or diesel
     * @param isPetrol true if petrol/ false if diesel
     */
    public void setIsPetrol(boolean isPetrol) {
        this.isPetrol = isPetrol;
    }
    
    //------------------------Other Methods--------------------
    
    /**
     * Returns the classification of the car's mileage
     * @return Classification of car's mileage
     */
    public String classification() {
        if (mileage < 20000) {
            return "Car has low mileage.";
        }
        else if (mileage >= 20000 && mileage <= 50000) {
            return "Car has medium mileage.";
        }
        else {
            return "Car has high mileage";
        }
    }
    
    /**
     * Checks if specific parts of the car need a replacement based on their fueltype and mileage
     * @return String if the car is fine or need a replacement
     */
    public String replacement() {
        if (isPetrol == true) {
            if (mileage > 75000) {
                return "You need to replace the spark plugs!";
            }
            else {
                return "Your spark plugs are fine";
            }
        }
        else {
            if(mileage > 100000) {
                return "You need to replace the compressor valve!";
            }
            else {
                return "Your compressor valve is fine";
            }
        }
    }
    
    /**
     * Displays a warning message if the car's mileage exceeds the relevant threshold
     * @return Message if exceeded or if not
     */
    public String displayWarning() {
        if (isPetrol == true) {
            if (mileage > 75000) {
                return "Warning! Threshold exceeded.";
            }
            else {
                return "Threshold not exceeded.";
            }
        }
        else {
            if(mileage > 100000) {
                return "Warning! Threshold exceeded!";
            }
            else {
                return "Threshold not exceeded.";
            }
        }
    }

    /**
     * toString method
     * @return Information in the fields
     */
    public String toString() {
        return "Car owner: \n" + getOwner() + "\nCar's make: " + getMake() + "\nCar's mileage: " + getMileage() + "\nUses petrol: " + isIsPetrol() + "\nClassification: " + classification() + "\nIssues: " + replacement() + "\nWarnings: " + displayWarning();
    }  
}