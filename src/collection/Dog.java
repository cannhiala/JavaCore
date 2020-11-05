/**
 * 
 */
package collection;

/**
 * @author CANTV
 *
 */
public class Dog implements Comparable<Dog> {

	public Dog(int x) {
		size = x;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	int size;

	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return this.size - o.size;
	}

}
