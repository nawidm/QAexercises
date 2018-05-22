package Library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class HeyHeyHeyThisIsLibrary {
	
	private ArrayList<ReadingMaterial> inStock;
	private ArrayList<ReadingMaterial> checkedOut;
	private ArrayList<Person> members;
	private ArrayList<Integer> whichMemberCheckOut;
	
	public HeyHeyHeyThisIsLibrary() {
		this.inStock = new ArrayList<ReadingMaterial>();
		this.checkedOut = new ArrayList<ReadingMaterial>();
		this.members = new ArrayList<Person>();
		this.whichMemberCheckOut = new ArrayList<Integer>();
	}
	
	public boolean checkOutItem(int id, int personId) {
		
		for(ReadingMaterial r : inStock) {
			if(r.getId() == id) {	
				this.whichMemberCheckOut.add(personId);
				this.checkedOut.add(r);
				this.inStock.remove(r);
				return true;
			}
		}
		return false;
	}
	
	public boolean checkInItem(int id) {
		
		for(ReadingMaterial r : checkedOut) {
			if(r.getId() == id) {	
				this.inStock.add(r);
				this.whichMemberCheckOut.remove(this.checkedOut.indexOf(r));
				this.checkedOut.remove(r);
				
				return true;
			}
		}
		return false;
	}
	
	public boolean addItem(ReadingMaterial item) {
		
		boolean exists = false;
		for(ReadingMaterial r : inStock) {
			if(r.equals(item)) {
				exists = true;
			}
		}
		
		for(ReadingMaterial r : checkedOut) {
			if(r.equals(item)) {
				exists = true;
			}
		}

		if(exists == false) {
			inStock.add(item);
		}
		
		return !exists;
	}
	
	public boolean removeItem(int id) {
		
		for(ReadingMaterial r : inStock) {
			if(r.getId() == id) {
				this.inStock.remove(r);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateItem(int id, String name) {
		
		for(ReadingMaterial r : inStock) {
			if(r.getId() == id) {
				r.setName(name);
			}
			return true;
		}
		return false;
		
	}
	
	
	public void registerPerson(String name, int age) {
		members.add(new Person(name, age));
	}
	
	public boolean deletePerson(int personId) {
		for(Person p : members) {
			if(p.getId() == personId && !whichMemberCheckOut.contains(personId)) {
				members.remove(p);
				return true;
			} else if(p.getId() == personId) {
				System.out.println(p.getName()+" cannot be deleted as they still have items checked out");
			}
		}
		return false;
	}
	
	public boolean updatePerson(int personId, String name) {
		
		for(Person p : members) {
			if(p.getId() == personId) {
				p.setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updatePerson(int personId, int age) {
		
		for(Person p : members) {
			if(p.getId() == personId) {
				p.setAge(age);
				return true;
			}
		}
		return false;
	}
	
	public void outputToFile() {
		try
		{
			//File f = new File("LibContents.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter("LibContents.txt"));
			bw.write("All books currently in the library"); ;
			bw.newLine();
			for(ReadingMaterial r : inStock) {
				bw.write("itemID: "+r.getId()+" | itemName: "+r.getName());
				bw.newLine();
			}
			bw.newLine();
			bw.write("All books currently checkout out");
			bw.newLine();
			for(ReadingMaterial r : checkedOut) {
				int idOfMember = whichMemberCheckOut.get(checkedOut.indexOf(r));
				Person p1; 
				for(Person p : members) {
					if(p.getId() == idOfMember) {
						p1 = p;
						bw.write("itemID: "+r.getId()+" | itemName: "+r.getName()+"     checked out by     memberID: "+idOfMember+" | memberName: "+p1.getName());
						bw.newLine();
						break;
					}
				}
			}
			bw.newLine();
			bw.write("All current members"); 
			bw.newLine();
			for(Person p : members) {
				bw.write("memberID: "+p.getId()+" | memberName: "+p.getName()); 
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			System.out.println();
		}
	}
	
	public void inputFromFile(String fileName) {
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = "";
			while((line = br.readLine()) != null) {
				ReadingMaterial item;
				String[] linePieces = line.split(" ");
				if(linePieces[0].equals("Book")) {
					item = new Book(linePieces[1],linePieces[2],linePieces[3]);
					addItem(item);
				} else if(linePieces[0].equals("Newspaper")) {
					item = new Newspaper(linePieces[1],Integer.parseInt(linePieces[2]),Boolean.parseBoolean(linePieces[3]));
					addItem(item);

				} else if(linePieces[0].equals("Magazine")) {
					item = new Magazine(linePieces[1],Integer.parseInt(linePieces[2]),Boolean.parseBoolean(linePieces[3]));
					addItem(item);

				} else if(linePieces[0].equals("AcademicJournal")) {
					item = new AcademicJournal(linePieces[1],linePieces[2],linePieces[3]);
					addItem(item);
				} 
			}
			
			br.close();
		} catch(Exception e) {
			
		}
		
	}

	public ArrayList<ReadingMaterial> getInStock() {
		return inStock;
	}

	public void setInStock(ArrayList<ReadingMaterial> inStock) {
		this.inStock = inStock;
	}

	public ArrayList<ReadingMaterial> getCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(ArrayList<ReadingMaterial> checkedOut) {
		this.checkedOut = checkedOut;
	}

	public ArrayList<Person> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Person> members) {
		this.members = members;
	}
 
	public ArrayList<Integer> getMemberCheckOut() {
		return whichMemberCheckOut;
	}

	public void setMemberCheckOut(ArrayList<Integer> memberCheckOut) {
		this.whichMemberCheckOut = memberCheckOut;
	}
	
	public String toString() {
		String output = "";
		output += "All books currently in the library\n";
		for(ReadingMaterial r : inStock) {
			output += r.getId()+" "+r.getName()+"\n";
		}
		output += "\nAll books currently checkout out\n";
		for(ReadingMaterial r : checkedOut) {
			int idOfMember = whichMemberCheckOut.get(checkedOut.indexOf(r));
			Person p1; 
			for(Person p : members) {
				if(p.getId() == idOfMember) {
					p1 = p;
					output += r.getId()+" "+r.getName()+" checked out by ID: "+idOfMember+" Name: "+p1.getName()+"\n";
					break;
				}
			}
		}
		output += "\nAll current members\n";
		for(Person p : members) {
			output += p.getId()+" "+p.getName();
		}
		return output;
		
	}
}
