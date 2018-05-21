package Library;

import java.util.ArrayList;

public class HeyHeyHeyThisIsLibrary {
	
	ArrayList<ReadingMaterial> inStock;
	ArrayList<ReadingMaterial> checkedOut;
	ArrayList<Person> members;
	ArrayList<Integer> whichMemberCheckOut;
	
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
