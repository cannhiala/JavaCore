/**
 * 
 */
package core;

import java.util.Arrays;

/**
 * @author CANTV
 *
 */
public class PermutationStringTest {

	String sort(String s) {
		char[] content = s.toCharArray();
//		for (char c : content) {
//			System.out.print(c);
//		}
		Arrays.sort(content);
//		for (char c : content) {
//			System.out.print(c);
//		}
		return content.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationStringTest permutationStringTest = new PermutationStringTest();
		System.out.println(permutationStringTest.sort("Tang van Can"));
	}

}
