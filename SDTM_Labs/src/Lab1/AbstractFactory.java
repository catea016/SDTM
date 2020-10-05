package Lab1;

public abstract class AbstractFactory {
    public abstract PizzaBuilder getBuilder(String position);
}
class MondayFactory extends AbstractFactory{
    public PizzaBuilder getBuilder(String topping) {
        PizzaBuilder builder = null;
        if(topping == "ham + pineapple")
            builder = new HawaiianPizzaBuilder();
        return builder;
    }
}
class TuesdayFactory extends AbstractFactory{
    public PizzaBuilder getBuilder(String topping){
        PizzaBuilder builder = null;
        if(topping == "pepperoni + salami")
            builder = new SpicyPizzaBuilder();
        return builder;
    }
}

class WednesdayFactory extends AbstractFactory{
    public PizzaBuilder getBuilder(String topping){
        PizzaBuilder builder = null;
        if(topping == "chicken + pepperoni")
            builder = new BarbequePizza();
        return builder;
    }
}

class ThursdayFactory extends  AbstractFactory{
    public PizzaBuilder getBuilder(String topping){
        PizzaBuilder builder = null;
        if(topping == "chicken + gogoshars + mushrooms")
            builder = new RanchoPizza();
        return builder;
    }
}

class FridayFactory extends  AbstractFactory{
    public PizzaBuilder getBuilder(String topping){
        PizzaBuilder builder = null;
        if(topping == "bacon + mushrooms")
            builder = new BaconPizza();
        return builder;
    }
}
