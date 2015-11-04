import java.util.*;
/**
 * 
 * @author SNC
 *
 */
public class Sort {
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.sort(list);
        System.out.println(list);
    }
}