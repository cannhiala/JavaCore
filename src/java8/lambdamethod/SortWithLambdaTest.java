/**
 * 
 */
package java8.lambdamethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CANTV
 *
 */
public class SortWithLambdaTest {
	
	private static List<Student> getStudents() {
		List<Student> students =  new ArrayList<Student>();
		students.add(new Student("Nguyen Van A", (byte) 18, "6A"));
		students.add(new Student("Tang Van Can", (byte) 17, "7A"));
		students.add(new Student("Nguyen Trong Hieu", (byte) 22, "6A"));
		students.add(new Student("Tong Thi Thoan", (byte) 35, "6A"));
		students.add(new Student("Tran Van Hoan", (byte) 18, "6A"));
		return students;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = getStudents();
		
		System.out.println("Students After Sort");
		students.sort((o1, o2) -> {
			byte ageCompare = (byte) (o1.getAge() - o2.getAge());
			byte nameCompate = (byte) o1.getName().compareTo(o2.getName());
			if (ageCompare == 0) return nameCompate;
			return ageCompare;
		});
		
		students.forEach(student -> System.out.println(student));
	}

}
