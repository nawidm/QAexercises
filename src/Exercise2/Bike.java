package Exercise2;

public class Bike extends Vehicle{
	
	int numberOfGears;
	
	public Bike(int id, String manufacturer, String colour, int numberOfGears) {
		super(id,manufacturer,colour);
		this.type = "Bike";
		this.numberOfGears = numberOfGears;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
}
