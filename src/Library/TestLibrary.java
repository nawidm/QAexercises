package Library;

public class TestLibrary {
	
	public static void main(String[] args) {
		ReadingMaterial item1 = new Book("harry potter", "J. K. Rowling", "Fantasy");
		ReadingMaterial item2 = new Book("the very hungry caterpillar", "eric carle", "Childrenss Literature");
		ReadingMaterial item3 = new Book("hobbit", "J.R.R tolkien", "Fantasy");
		ReadingMaterial item4 = new Book("Goosebumps", "R.L Stine", "Horror");
		
		Library lib = new Library();
		lib.addItem(item1);
		lib.addItem(item2);
		lib.addItem(item3);
		lib.addItem(item4);
		
		

	}
}
