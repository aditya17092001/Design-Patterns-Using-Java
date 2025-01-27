package SOLUTION;

import SOLUTION.Strategy.SportsDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle() {
        super(new SportsDriveStrategy());
    }
}