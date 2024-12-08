package strategy_pattern.withStrategyPattern.vehicle;

import strategy_pattern.withStrategyPattern.driveStrategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
