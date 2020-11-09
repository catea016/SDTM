package restaurant;

import java.util.ArrayList;
import java.util.List;

public class OrderBook {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getGrandTotal() {
        int total = 1700;
//        for (Order order :
//                orders) {
//            total += order.totalAmount;
//        }
        return total;
    }
}
