package NULLObjectPattern;

public class NullObject implements Vehicle {
    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getFeulTankSeatingCapacity() {
        return 0;
    }
}
