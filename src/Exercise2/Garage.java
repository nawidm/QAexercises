package Exercise2;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> listOfVehicles;
	public Garage() {
		listOfVehicles = new ArrayList<Vehicle>();
	}
	
	public void addVehicle(Vehicle v) {
		this.listOfVehicles.add(v);
	}
	
	public void removeVehicle(int id) {
		for(Vehicle v : listOfVehicles) {
			if(v.getId()==id){
				listOfVehicles.remove(v);
			}
		}
	}
	
	public void removeVehicle(String Type) {
		for(Vehicle v : listOfVehicles) {
			if(v.getType().equals(Type)){
				listOfVehicles.remove(v);
			}
		}
	}
	
	public int fixVehicle() {
		int bill = 0;
		
		for(Vehicle v : listOfVehicles) {
			if(v.getType().equals("Car")) {
				bill += 15;
			} else if(v.getType().equals("Bike")) {
				bill += 5;
			} else if(v.getType().equals("Truck")) {
				bill += 30;
			}
		}
		
		return bill;
	}
	
	public void emptyGarage() {
		listOfVehicles = new ArrayList<Vehicle>();
	}
}