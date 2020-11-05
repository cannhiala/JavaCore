/**
 * 
 */
package core;

/**
 * @author CANTV
 *
 */
public class UniqueCharInStringTest {
	
	boolean isUniqueChars(String str) {
		if (str.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(val);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharInStringTest uniqueCharInStringTest = new UniqueCharInStringTest();
		String str = "Tang Van Can";
		System.out.println(str.charAt(0));
		System.out.println(uniqueCharInStringTest.isUniqueChars(str));
	}

}
