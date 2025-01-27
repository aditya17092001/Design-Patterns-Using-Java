public class Main {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();

        sportyVehicle.drive();
        passengerVehicle.drive();
        offRoadVehicle.drive();
    }
}
