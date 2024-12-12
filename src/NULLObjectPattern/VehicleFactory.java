package NULLObjectPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        Vehicle vehicle = null;
        switch (type){
            case "car":vehicle = new Car();
            break;
            case "bike":vehicle = new Bike();
            break;
            default:vehicle = new NullObject();
        }
        return vehicle;
    }

}
