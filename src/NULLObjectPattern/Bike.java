package NULLObjectPattern;

public class Bike implements Vehicle{
    @Override
    public int getSeatingCapacity() {
        return 2;
    }

    @Override
    public int getFeulTankSeatingCapacity() {
        return 20;
    }
}
