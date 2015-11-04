
import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JunitTesting test= new JunitTesting();
		int output=test.square(5);
		assertEquals(25,output);
	}

}
