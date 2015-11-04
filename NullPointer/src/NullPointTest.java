import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;
/**
 * 
 * @author manoj
 *
 */

public class NullPointTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ArrayList b=NullPointer.initialiser(1);
		assertNull(b);
	}

}
