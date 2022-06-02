package afternoon;

public class Test {
	public static void main(String[] args) {
		
		Driver d = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle v = new Vehicle();
		
		d.drive(v);
		d.drive(bus); // Vechicle v = bus;
		d.drive(taxi);
	}

}
