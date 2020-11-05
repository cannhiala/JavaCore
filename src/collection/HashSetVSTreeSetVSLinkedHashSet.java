/**
 * 
 */
package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author CANTV
 *
 */
public class HashSetVSTreeSetVSLinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://viblo.asia/p/java-hashset-vs-treeset-vs-linkedhashset-AyQMpJ07v0Ek
		Random r = new Random();
		HashSet<Dog> hashSet = new HashSet();
		TreeSet<Dog> treeSet = new TreeSet();
		LinkedHashSet<Dog> linkedSet = new LinkedHashSet();

		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
		int x = r.nextInt(1000 - 10) + 10;
		hashSet.add(new Dog(x));
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
		int x = r.nextInt(1000 - 10) + 10;
		treeSet.add(new Dog(x));
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
		int x = r.nextInt(1000 - 10) + 10;
		linkedSet.add(new Dog(x));
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);
	}

}
