package strategy_pattern.withStrategyPattern.vehicle;

import strategy_pattern.withStrategyPattern.driveStrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
