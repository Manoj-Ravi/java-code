/**
 * 
 * @author SNC
 *
 */
public class Rectangle extends Point {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
	origin = new Point(0, 0);
    }
    /**
     * 
     * @param p
     */
    public Rectangle(Point p) {
	origin = p;
    }
    /**
     * 
     * @param w
     * @param h
     */
    public Rectangle(int w, int h) {
	origin = new Point(0, 0);
	width = w;
	height = h;
    }
    /**
     * 
     * @param p
     * @param w
     * @param h
     */
    public Rectangle(Point p, int w, int h) {
	origin = p;
	width = w;
	height = h;
    }

    // a method for moving the rectangle
    /**
     * 
     * @param x
     * @param y
     */
    public void move(int x, int y) {
	origin.x = x;
	origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
	return width * height;
    }


