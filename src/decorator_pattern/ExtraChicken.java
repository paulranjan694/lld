package decorator_pattern;

public class ExtraChicken extends ToppingsDecorator{

    BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost() + 10;
    }
}
