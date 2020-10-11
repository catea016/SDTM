package Lab1_CreationalDP;

public class Visitor extends Person {
    // creating new order from the visitor
    public Order newOrder() {

        return new Order.OrderBuilder()
                .add("Soup of the day")
                .add("English Breakfast")
                .add("Fresh juice")
                .add("Tuna Salad")
                .build();
    }
}
