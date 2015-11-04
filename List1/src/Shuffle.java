
import java.util.*;
/**
 * 
 * @author SNC
 *
 */
public class Shuffle {
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}