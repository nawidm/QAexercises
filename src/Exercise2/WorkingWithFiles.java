package Exercise2;

import java.io.*;
import java.util.ArrayList;

public class WorkingWithFiles {
	public static void main(String[] args) {
		ArrayList<Person> listOfPeople = new ArrayList<Person>();
		
		Person person1 = new Person("Nawid",23,"Trainee");
		Person person2 = new Person("Barry",31,"Plumber");
		Person person3 = new Person("Sam", 19, "Student");
		Person person4 = new Person("David", 24, "Gamer");
		Person person5 = new Person("Michael", 45, "Lawyer");
		
		listOfPeople.add(person1);
		listOfPeople.add(person2);
		listOfPeople.add(person3);
		listOfPeople.add(person4);
		listOfPeople.add(person5);
		
		File file = new File("test.txt");
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(file));
			for(Person p : listOfPeople) {
				bf.write(p.toString());
				bf.newLine();
			}
			bf.close();
			
		} catch(Exception e) {
			
		}
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String line;
			String input = "";
			while((line = br.readLine()) != null) {
				input += line+" ";
			}
			String[] inputs = input.split(" "); 

			for(int i=0;i<inputs.length-2;i=i+3) {
				Person p = new Person(inputs[i],Integer.parseInt(inputs[i+1]),inputs[i+2]);
				list.add(p);
			}
		} catch(Exception e) {
			
		}
		
		for(Person p : list) {
			System.out.println(p);
		}
		
	}
}
