package decorator_pattern;

public class ExtraCheese extends ToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost() + 10;
    }
}
