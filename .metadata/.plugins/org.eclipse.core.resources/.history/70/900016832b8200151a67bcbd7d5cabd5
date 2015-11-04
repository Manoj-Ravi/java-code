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
	
    // the Bicycle class has one constructor
   /**
    * 
    * @param startCadence
    * @param startSpeed
    * @param startGear
    */
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
	
    // the Bicycle class has four methods
    /**
     * 
     * @param newValue
     */
    public void setCadence(int newValue) {
        cadence = newValue;
    }
	
    /**
     * 
     * @param newValue
     */
    public void setGear(int newValue) {
        gear = newValue;
    }
	
/**
 * 
 * @param decrement
 */
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
	
   /**
    * 
    * @param increment
    */
    public void speedUp(int increment) {
        speed += increment;
    }
    
    /**
     * 
     */
    public void printDescription(){
    	 System.out.println("\nBike is in gear " + this.gear + " with a cadence of " +
    	        this.cadence + " and travelling at a speed of " + this.speed + ". ");
    	}
    
	
}