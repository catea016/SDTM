package Lab1_CreationalDP;

import java.util.ArrayList;

// implementing builder pattern
public class Order {

    ArrayList<String> items = new ArrayList<>();

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
