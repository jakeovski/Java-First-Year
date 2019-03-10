package Task2;


/**
 * A model for number on the display
 * @author Vladimir Bardadom
 * @version 1.0 09/03/2019
 */

public class NumberDisplay {
    
    /**
     * Seconds
     */
    private int sec;
    
    private int tick;
    
    /**
     * Minutes
     */
    private int min;
    
    
    /**
     * Hours
     */
    private int hours;
    
    /**
     * Limit for the num to stop
     */
    private int limit;
    
    /**
     * Constructor for NumberDisplay
     * @param aLimit Limit for time
     */
    public NumberDisplay(int aLimit) {
        tick = 0;
        sec = tick % aLimit;
        min = 0;
        hours = 0;
        limit = aLimit;
    }
    
    //------------Getter Methods----------------

    /**
     * Gets seconds 
     * @return Seconds
     */
    public int getSec() {
        return sec;
    }

    /**
     * Gets ticks 
     * @return Ticks
     */
    public int getTick() {
        return tick;
    }

    /**
     * Gets minutes
     * @return Minutes
     */
    public int getMin() {
        return min;
    }

    /**
     * Gets hours
     * @return Hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Gets Limit 
     * @return Limit
     */
    public int getLimit() {
        return limit;
    }

    
    
    //-------------Setter Method-------------------

    /**
     * Sets seconds
     * @param sec Seconds
     */
    public void setSec(int sec) {
        this.sec = sec;
    }

    /**
     * Sets ticks
     * @param tick Ticks
     */
    public void setTick(int tick) {
        this.tick = tick;
    }

    /**
     * Sets minutes
     * @param min Minutes
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Sets hours 
     * @param hours Hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Sets limit 
     * @param limit Limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
       
    //-----------Other Methods--------------------
    
    /**
     * Mthod that changes the time adding ticks
     */
    public void time() {
        sec = tick % limit;
        if(tick % 60 == 0 && tick > 0) {
            min++;
            if (min == 60) {
                min = 0;
                hours++;
                if(hours == 24) {
                    hours = 0;
                }
            }
        }
        tick++;
        
    }
    
    /**
     * toString method
     * @return Information in the fields
     */
    public String toString() {
        return getHours() + " : " + getMin() + " : " + getSec();
    }
}

