import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author manoj
 *
 */
public class TimeOutTest {

	@Test(timeout=1000)
	public void test() {
		//fail("Not yet implemented");
		int a=InfiniteLoop.loop(2);
		
	}

}
