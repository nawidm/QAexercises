package Exercise2;

public class Vehicle {
	private int id;
	protected String type;
	private String manufacturer;
	private String colour;

	public Vehicle(int id, String manufacturer, String colour) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.colour = colour;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
