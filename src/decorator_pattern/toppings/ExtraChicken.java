package decorator_pattern.toppings;

import decorator_pattern.BasePizza;

public class ExtraChicken extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost() + 10;
    }
}
