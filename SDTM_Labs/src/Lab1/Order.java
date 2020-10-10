package Lab1;

import java.util.ArrayList;

public class Order {

    ArrayList<String> items = new ArrayList<>();

    // builder pattern
    public static class OrderBuilder {

        ArrayList<String> items = new ArrayList<>();

        public OrderBuilder() {

        }

        public OrderBuilder add(String orderItem) {
            items.add(orderItem);
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.items = this.items;
            return order;
        }
    }
}
