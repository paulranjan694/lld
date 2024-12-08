package strategy_pattern.withStrategyPattern.driveStrategy;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport Drive Capability");
    }
}
