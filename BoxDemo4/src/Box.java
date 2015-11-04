/**
 * 
 * @author manoj
 *
 * @param <T>
 */
public class Box<T> {

    private T t; // T stands for "Type"          

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
}