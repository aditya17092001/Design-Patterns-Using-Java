
public class OrdinaryFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String type) {
		if(type.equals("SWIFT")) {
			return new Swift();
		} else if(type.equals("WAGONR")) {
			return new Wagonr();
		} else {
			return null;
		}
	}
	
}
