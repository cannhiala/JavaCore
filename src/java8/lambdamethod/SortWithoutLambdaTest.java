package java8.lambdamethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLambdaTest {
	
	private static List<Student> getStudents() {
		List<Student> students =  new ArrayList<Student>();
		students.add(new Student("Nguyen Van A", (byte) 18, "6A"));
		students.add(new Student("Tang Van Can", (byte) 17, "7A"));
		students.add(new Student("Nguyen Trong Hieu", (byte) 22, "6A"));
		students.add(new Student("Tong Thi Thoan", (byte) 35, "6A"));
		students.add(new Student("Tran Van Hoan", (byte) 18, "6A"));
		return students;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = getStudents();
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				byte ageConpare = (byte) (o1.getAge() - o2.getAge());
				int nameCompare =  o2.getName().compareTo(o1.getName());
				if(ageConpare == 0) return nameCompare;
				return ageConpare;
			}
		} );

		System.out.println("Students After Sort");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
