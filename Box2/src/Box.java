/**
 * 
 * @author manoj
 *
 * @param <T>
 */
public class Box<T> {

    private T t;          

    /**
     * 
     * @param t
     */
    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    /**
     * 
     * @param u
     */
    public <U> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        integerBox.inspect("some text");
    }
}