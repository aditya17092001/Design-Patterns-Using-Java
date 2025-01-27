public class Main {
    public static void main(String[] args) {
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        passengerVehicle.drive();
        sportyVehicle.drive();
        offRoadVehicle.drive();
    }
}

