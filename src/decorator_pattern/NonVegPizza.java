package decorator_pattern;

public class NonVegPizza extends BasePizza {
    @Override
    public int getCost() {
        return 110;
    }
}
