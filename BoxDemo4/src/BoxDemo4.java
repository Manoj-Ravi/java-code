/**
 * 
 * @author manoj
 *
 */
public class BoxDemo4 {

	/**
	 * 
	 * @param u
	 * @param boxes
	 */
  public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
    Box<U> box = new Box<>();
    box.add(u);
    boxes.add(box);
  }

  /**
   * 
   * @param boxes
   */
  public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
    int counter = 0;
    for (Box<U> box: boxes) {
      U boxContents = box.get();
      System.out.println(
        "Box #" + counter + " contains [" +
        boxContents.toString() + "]");
      counter++;
    }
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    java.util.ArrayList<Box<Integer>> listOfIntegerBoxes =
      new java.util.ArrayList<>();
    BoxDemo4.<Integer>addBox(new Integer(10), listOfIntegerBoxes);
    BoxDemo4.addBox(new Integer(20), listOfIntegerBoxes);
    BoxDemo4.addBox(new Integer(30), listOfIntegerBoxes);
    BoxDemo4.outputBoxes(listOfIntegerBoxes);
  }
}