/**
 * 
 * @author manoj
 *
 */
public class MountainBike extends Bicycle{
  private String suspension;
/**
 * 
 * @param startCadence
 * @param startSpeed
 * @param startGear
 * @param suspensionType
 */
  public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType){
    super(startCadence, startSpeed, startGear);
    this.setSuspension(suspensionType);
  }

  public String getSuspension(){
    return this.suspension;
  }

  /**
   * 
   * @param suspensionType
   */
  public void setSuspension(String suspensionType){
    this.suspension = suspensionType;
  }

  public void printDescription(){
    super.printDescription();
    System.out.println("The MountainBike has a " + getSuspension()
            + " suspension.");
  }
} 