package Lab1;

public class Visitor extends Person {

    public Order newOrder() {

        return new Order.OrderBuilder()
                .add("Soup of the day")
                .add("English Breakfast")
                .add("Fresh juice")
                .add("Tuna Salad")
                .build();
    }
}
