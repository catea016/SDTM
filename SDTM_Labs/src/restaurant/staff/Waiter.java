package restaurant.staff;

import restaurant.OrderBook;
import restaurant.kitchen.Kitchen;
import restaurant.Order;
import restaurant.Person;
import restaurant.menu.Menu;

public class Waiter implements Person {
    // class that give menu to visitor, take his order and send it to kitchen
    Menu menu;
    Order order;
    OrderBook orderBook;

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void sendOrderToKitchen(Kitchen kitchen) {
        kitchen.acceptOrder(order);
    }

    public void takeOrder(Order newOrder) {
        this.order = newOrder;
        orderBook.addOrder(order);
    }

    public void setOrderBook(OrderBook orderBook) {
        this.orderBook = orderBook;
    }
}
