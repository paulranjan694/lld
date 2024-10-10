package decorator_pattern;

public class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost() + 15;
    }
}
