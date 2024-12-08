package strategy_pattern.withStrategyPattern.vehicle;

import strategy_pattern.withStrategyPattern.driveStrategy.SportDriveStrategy;

public class SportVehicle extends Vehicle {

    SportVehicle(){
        super(new SportDriveStrategy());
    }
}
