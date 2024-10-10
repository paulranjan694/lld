package decorator_pattern;

public class PizzaStore {
    public static void main(String[] args) {
        //Customer 1 wants non-veg pizza with extra-chicken
        BasePizza basePizzaCust1 = new NonVegPizza();
        BasePizza toppingExtraChicken = new ExtraChicken(basePizzaCust1);
        System.out.println("Total cost for customer1: "+toppingExtraChicken.getCost());

        // Customer 1 wants veg pizza with mushrooms and extra cheese
        BasePizza basePizzaCust2 = new NonVegPizza();
        BasePizza toppingMushroom= new Mushroom(basePizzaCust2);
        BasePizza toppingExtraCheese = new ExtraCheese(toppingMushroom);
        System.out.println("Total cost for customer2: "+ toppingExtraCheese.getCost());
    }
}
