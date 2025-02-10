public class LuxuryFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String type) {
		if(type.equals("BMW")) {
			return new BMW();
		} else if(type.equals("AUDI")) {
			return new Audi();
		} else {
			return null;
		}
	}
	
}
