package Library;

public abstract class ReadingMaterial {
	
	private static int count = 0;
	
	private int id;
	private String name;
	private int numberOfReads;
	
	
	public ReadingMaterial(String name) {
		this.name = name;
		numberOfReads = 0;
		id = ++count;
	}

	public String read() {
		this.numberOfReads++;
		return name+" has been read "+this.numberOfReads+" times.";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfReads() {
		return numberOfReads;
	}

	public void setNumberOfReads(int numberOfReads) {
		this.numberOfReads = numberOfReads;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
