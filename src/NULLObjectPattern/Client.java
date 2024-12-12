package NULLObjectPattern;

public class Client {
    public static void main(String[] args) {
        //valid vehicle type passed to factory
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        printVehicleDetails(vehicle);

        //invalid vehicle type passed to factory
        Vehicle vehicle1 = VehicleFactory.getVehicle("bus");
        printVehicleDetails(vehicle1);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("seating capacity : "+ vehicle.getSeatingCapacity());
        System.out.println("fuel tank capacity : "+ vehicle.getFeulTankSeatingCapacity());
    }
}
