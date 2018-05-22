package Library;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestLibrary {
	
	@Test
	public void addingItemTest() {
		HeyHeyHeyThisIsLibrary lib = new HeyHeyHeyThisIsLibrary();
		ReadingMaterial item1 = new Book("harry potter", "J. K. Rowling", "Fantasy");
		lib.addItem(item1);
		assertTrue(lib.getInStock().contains(item1));
	}
	
	@Test
	public void removingItemTest() {
		HeyHeyHeyThisIsLibrary lib = new HeyHeyHeyThisIsLibrary();
		ReadingMaterial item1 = new Book("harry potter", "J. K. Rowling", "Fantasy");
		lib.addItem(item1);
		lib.removeItem(item1.getId());
		assertTrue(!lib.getInStock().contains(item1));
	}
	
	@Test
	public void CheckOutItemTest() {
		HeyHeyHeyThisIsLibrary lib = new HeyHeyHeyThisIsLibrary();
		ReadingMaterial item1 = new Book("harry potter", "J. K. Rowling", "Fantasy");
		lib.addItem(item1);
		assertTrue(!lib.getInStock().contains(item1));
		assertTrue(lib.getCheckedOut().contains(item1));
	}
	
	/*public static void main(String[] args) {
		ReadingMaterial item1 = new Book("harry potter", "J. K. Rowling", "Fantasy");
		ReadingMaterial item2 = new Book("the very hungry caterpillar", "eric carle", "Childrenss Literature");
		ReadingMaterial item3 = new Book("hobbit", "J.R.R tolkien", "Fantasy");
		ReadingMaterial item4 = new Book("Goosebumps", "R.L Stine", "Horror");
		
		HeyHeyHeyThisIsLibrary lib = new HeyHeyHeyThisIsLibrary();
		lib.addItem(item1);
		lib.addItem(item2);
		lib.addItem(item3);
		lib.addItem(item4);
		
		lib.registerPerson("Nawid", 23);
		lib.checkOutItem(2, 1);
		//System.out.println(lib);
		lib.inputFromFile("LibInput.txt");
		lib.outputToFile();
		

	}*/
}
