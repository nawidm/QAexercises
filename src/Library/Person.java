package Library;

public class Person {
	
	private static int count = 0;
	
	private int id;
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		id = ++count;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return getName()+" "+getAge();
	}
}
