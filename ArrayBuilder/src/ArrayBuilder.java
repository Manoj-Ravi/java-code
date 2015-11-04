import java.util.*;

/**
 * 
 * @author manoj
 *
 */
public class ArrayBuilder {
/**
 * 
 * @param listArg
 * @param elements
 */
  public static <T> void addToList (List<T> listArg, T... elements) {
    for (T x : elements) {
      listArg.add(x);
    }
  }
/**
 * 
 * @param l
 */
  public static void faultyMethod(List<String>... l) {
    Object[] objectArray = l;  // Valid
    objectArray[0] = Arrays.asList(new Integer(42));
    String s = l[0].get(0);    // ClassCastException thrown here
  }

}
