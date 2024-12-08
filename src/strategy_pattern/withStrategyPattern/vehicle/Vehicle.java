package strategy_pattern.withStrategyPattern.vehicle;

import strategy_pattern.withStrategyPattern.driveStrategy.DriveStrategy;

public class Vehicle {
   DriveStrategy driveStrategy;

   Vehicle(DriveStrategy driveStrategy) {
       this.driveStrategy = driveStrategy;
   }

    public void drive() {
       driveStrategy.drive();
    }
}
