import java.util.ArrayList;

/**
 * 
 * @author manoj
 *
 */
public class NullPointer {
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static ArrayList initialiser(int a){
		ArrayList list;
		if(a==0)
			list=new ArrayList();
		else
			list=null;
		return list;
	}

}
