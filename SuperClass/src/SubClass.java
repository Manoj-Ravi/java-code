/**
 * 
 * @author manoj
 *
 */
public class SubClass extends SuperClass {

    public void printMethod() { //overrides printMethod in Superclass
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
    	
    SubClass s = new SubClass();
    s.printMethod();	
    }

}