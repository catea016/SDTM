package restaurant;

import java.util.ArrayList;

// implementing builder pattern
public class Order {

    ArrayList<Item> items = new ArrayList<>();

    public static class OrderBuilder {

        ArrayList<Item> items = new ArrayList<>();

        public OrderBuilder() {

        }

        public OrderBuilder add(String orderItem) {
            return add(orderItem, 1);
        }

        public OrderBuilder add(String itemName, int quantity) {
            items.add(new Order.Item(itemName, quantity));
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.items = this.items;
            return order;
        }
    }

    public static class Item {
        public final String itemName;
        public final int quantity;

        public Item(String itemName, int quantity) {
            this.itemName = itemName;
            this.quantity = quantity;
        }
    }
}
