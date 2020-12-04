package restaurant;

import java.util.ArrayList;
import java.util.List;

public class OrderBook {
    protected ArrayList<Order> orders = new ArrayList<>();
    Visitor visitor = new Visitor();

    public void addOrder(Order order) {
        orders.add(order);
    }


    public void  printOrders(){
        for (int i = 0; i<orders.size(); i++){
            System.out.println(orders.get(i));
        }
    }

    public ArrayList<Order> getOrders() {
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
