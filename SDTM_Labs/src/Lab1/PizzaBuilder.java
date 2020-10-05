package Lab1;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
//Monday menu
/* Hawaiian Pizza builder */
class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham + pineapple");
    }
}
// Tuesday menu
/* Spicy Pizza builder */
class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni + salami");

    }
}
//Wednesday menu
class BarbequePizza extends PizzaBuilder{

    public void buildDough() {
        pizza.setDough("pan Baked");
    }
    public void buildSauce() {
        pizza.setSauce("BBQ sauce");
    }
    public void buildTopping() {
        pizza.setTopping("chicken + pepperoni");
    }
}
//Thursday menu
class RanchoPizza extends  PizzaBuilder{

    public void buildDough() {
        pizza.setDough("cross");
    }
    public void buildSauce(){
        pizza.setSauce("mozzarella");
    }
    public void buildTopping(){
        pizza.setTopping("chicken + gogoshars + mushrooms");
    }
}

//Friday Menu
class BaconPizza extends PizzaBuilder{

    public void buildDough() {
        pizza.setDough("cross");
    }
    public void buildSauce() {
        pizza.setSauce("tomato");
    }
    public void buildTopping() {
        pizza.setTopping("bacon + mushrooms");
    }
}

/* "Director" */
class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizza) {
        pizzaBuilder = pizza;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();

    }
}

