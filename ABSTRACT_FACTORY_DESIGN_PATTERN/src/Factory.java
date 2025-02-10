public class Factory {
	public static VehicleFactory getFactory(String type) {
		if(type.equals("LUXURY")) {
			return new LuxuryFactory();
		} else if(type.equals("ORDINARY")) {
			return new OrdinaryFactory();
		} else {
			return null;
		}
	}
}
