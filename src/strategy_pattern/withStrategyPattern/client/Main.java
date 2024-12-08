package strategy_pattern.withStrategyPattern.client;

import strategy_pattern.withoutStrategyPattern.vehicle.OffRoadVehicle;
import strategy_pattern.withoutStrategyPattern.vehicle.PassengerVehicle;
import strategy_pattern.withoutStrategyPattern.vehicle.SportVehicle;

public class Main {
    public static void main(String[] args) {
        SportVehicle sportVehicle = new SportVehicle();
        sportVehicle.drive();

        PassengerVehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
