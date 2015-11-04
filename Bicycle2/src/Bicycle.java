
/**
 * 
 * @author manoj
 *
 */
public class Bicycle {
	
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
    
    /**
     * this constructor initialises the bicycle object
     * @param startCadence initial cadence 
     * @param startSpeed  initial speed
     * @param startGear  initial gear
     */
	
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
	
 // the Bicycle class has four methods
   /**
    *  
    * @param newValue of cadence
    */
    public void setCadence(int newValue) {
        cadence = newValue;
    }
	
    /**
     * 
     * @param newValue of gear
     */
    public void setGear(int newValue) {
        gear = newValue;
    }
	
    /**
     * 
     * @param decrement speed
     */
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
	
    /**
     * 
     * @param increment speed
     */
    public void speedUp(int increment) {
        speed += increment;
    }
	
}