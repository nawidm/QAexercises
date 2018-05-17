package Exercise2;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJobtitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return getName()+" "+getAge()+" "+getJobTitle();
	}
}
