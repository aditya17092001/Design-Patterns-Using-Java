import SOLUTION.Strategy.SportsDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new SportsDriveStrategy());
    }
}
