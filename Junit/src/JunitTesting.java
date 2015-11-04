
/**
 * 
 * @author manoj
 *
 */
public class JunitTesting {
	/**
	 * 
	 * @param x
	 * @return
	 */
	public int square(int x){
		return x*x;
	}
	/**
	 * 
	 * @param word
	 * @return
	 */
	public int countA(String word){
		int count=0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
	
}
