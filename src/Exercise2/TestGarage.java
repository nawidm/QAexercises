package Exercise2;

public class TestGarage {
	public static void main(String[] args) {
		Car c1 = new Car(1, "Audi", "Black", 5);
		Bike b1 = new Bike(2,"Ariel","Red",6);
		Truck t1 = new Truck(3,"Mercedes","Grey",250);
		
		Garage g = new Garage();
		g.addVehicle(c1);
		g.addVehicle(b1);
		g.addVehicle(t1);
		
		System.out.println(g.fixVehicle());
		g.removeVehicle(2);
		System.out.println(g.fixVehicle());
		g.removeVehicle("Car");
		System.out.println(g.fixVehicle());

	}
}
