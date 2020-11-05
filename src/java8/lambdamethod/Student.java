package java8.lambdamethod;

public class Student {

	private String name;
	private byte age;
	private String className;
	
	public Student(String name, byte age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", className=" + className + "]";
	}
	
}
