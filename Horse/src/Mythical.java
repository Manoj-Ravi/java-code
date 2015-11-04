/**
 * 
 * @author SNC
 *
 */
public interface Mythical {
	/**
	 * 
	 * @return
	 */
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}