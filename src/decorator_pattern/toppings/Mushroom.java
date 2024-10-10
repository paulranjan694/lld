package decorator_pattern.toppings;

import decorator_pattern.BasePizza;

public class Mushroom extends ToppingsDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost() + 15;
    }
}
