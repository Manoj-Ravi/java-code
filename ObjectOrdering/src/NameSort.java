import java.util.*;
/**
 * 
 * @author SNC
 *
 */
public class NameSort {
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Name nameArray[] = {
            new Name("John", "Lennon"),
            new Name("Karl", "Marx"),
            new Name("Groucho", "Marx"),
            new Name("Oscar", "Grouch")
        };
        List<Name> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}