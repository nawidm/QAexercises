package Library;

public abstract class ReadingMaterial {
	
	String name;
	int numberOfPages;
	int numberOfReads;
	
	public ReadingMaterial(String name, int numberOfPages) {
		this.name = name;
		this.numberOfPages = numberOfPages;
		numberOfReads = 0;
	}

	public String read() {
		this.numberOfReads++;
		return name+" has been read "+this.numberOfReads+" times.";
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
