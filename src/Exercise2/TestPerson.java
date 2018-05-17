package Exercise2;

import java.util.ArrayList;

public class TestPerson {
	public static void main(String[] args) {
		Person person1 = new Person("Nawid",23,"Trainee Consultant");
		Person person2 = new Person("Barry",31,"Plumber");
		Person person3 = new Person("Sam", 19, "Student");
		Person person4 = new Person("David", 24, "Gamer");
		
		ArrayList<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(person1);
		listOfPerson.add(person2);
		listOfPerson.add(person3);
		listOfPerson.add(person4);

		for(Person person : listOfPerson) {
			System.out.println(person);
		}
		
		System.out.println(doesPersonExist(listOfPerson, "Barry"));
	}
	
	public static boolean doesPersonExist(ArrayList<Person> list, String name) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
