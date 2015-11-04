
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author manoj
 *
 */
public class countATest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JunitTesting test= new JunitTesting();
		int output=test.countA("alphabet");
		assertEquals(2,output);
	}

}
