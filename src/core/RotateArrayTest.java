/**
 * 
 */
package core;

/**
 * @author CANTV
 *
 */
public class RotateArrayTest {

	void leftRotate (int[] arr) {
		
		int i = 0, temp = arr[0];
		for (i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArrayTest rotateArrayTest =  new RotateArrayTest();
		int[] arr = {1,2,3,4,5,6,7};
		rotateArrayTest.leftRotate(arr);
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
