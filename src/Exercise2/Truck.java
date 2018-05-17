package Exercise2;

public class Truck extends Vehicle{
	
	int loadCapacity;
	
	public Truck(int id, String manufacturer, String colour, int loadCapacity) {
		super(id, manufacturer,colour);
		this.type = "Truck";
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
}
