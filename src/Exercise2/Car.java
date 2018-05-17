package Exercise2;

public class Car extends Vehicle {
	
	int numberOfDoors;
	
	public Car(int id, String manufacturer, String colour, int numberOfDoors) {
		super(id, manufacturer,colour);
		this.type = "Car";
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
}
