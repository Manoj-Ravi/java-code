/**
 * 
 * @author SNC
 *
 */
public class PMDTest {
	/**
	 * 
	 * @param args
	 */
  public static void main(String args[]) {
    PMDTest.CALL_METHOD("hello");
    PMDTest.CallHello();
  }
  /**
   * 
   * @param INPUT_PARAMETER
   */
  public static void CALL_METHOD(String INPUT_PARAMETER) {
    System.out.println(INPUT_PARAMETER);
  }

  public static void CallHello() {
    System.out.println("Hello PMD World!");
  }
}