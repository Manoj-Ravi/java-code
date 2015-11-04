
import java.util.Map;
/**
 * 
 * @author SNC
 *
 */
public class EnvMap {
	/**
	 * 
	 * @param args
	 */
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }
    }
}
