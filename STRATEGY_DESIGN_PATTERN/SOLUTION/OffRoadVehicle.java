import SOLUTION.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
