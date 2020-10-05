package Lab1;

public class Main {
    public static void main(String[] args) {
        Menu menu = Menu.getMenu( );

        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzaBuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println("new pizza created with the following ingredients: " + pizza.getDough() + " , " + pizza.getSauce() + " , " + pizza.getTopping());


    }
}
