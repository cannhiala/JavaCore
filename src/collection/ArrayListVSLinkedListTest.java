/**
 * 
 */
package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author CANTV
 *
 */
public class ArrayListVSLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://viblo.asia/p/arraylist-vs-linkedlist-vs-vector-3Q75wkb35Wb
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
		arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);

		// LinkedList add
		startTime = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
		linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);

		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
		arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);

		// LinkedList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
		linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);


		// ArrayList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >=0; i--) {
		arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);

		// LinkedList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >=0; i--) {
		linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);
	}

}
