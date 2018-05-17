package Library;

import java.util.ArrayList;

public class Library {
	
	ArrayList<ReadingMaterial> inStock;
	ArrayList<ReadingMaterial> checkedOut;
	ArrayList<Person> members;
	ArrayList<Integer> memberCheckOut;
	
	public Library() {
		this.inStock = new ArrayList<ReadingMaterial>();
		this.checkedOut = new ArrayList<ReadingMaterial>();
		this.members = new ArrayList<Person>();
		this.memberCheckOut = new ArrayList<Integer>();
	}
	
	public boolean checkOutItem(int id, int personId) {
		
		for(ReadingMaterial r : inStock) {
			if(r.getId() == id) {	
				this.memberCheckOut.add(personId);
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
				this.memberCheckOut.remove(this.checkedOut.indexOf(r));
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
			if(p.getId() == personId && !memberCheckOut.contains(personId)) {
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
		return memberCheckOut;
	}

	public void setMemberCheckOut(ArrayList<Integer> memberCheckOut) {
		this.memberCheckOut = memberCheckOut;
	}
	
	
}
