public class Main {
	public static void main(String args[]) {
		VehicleFactory luxuryFactory = Factory.getFactory("LUXURY");
		VehicleFactory ordinaryFactory = Factory.getFactory("ORDINARY");
		
		Vehicle bmw = luxuryFactory.getVehicle("BMW");
		Vehicle swift = ordinaryFactory.getVehicle("SWIFT");
		
		
		System.out.println(bmw.average());
		System.out.println(swift.average());
		
	}
}
