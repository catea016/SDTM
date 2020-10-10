package Lab1;

public class Waiter {
    Menu menu;
    Order order;
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void sendOrderToKitchen(Kitchen kitchen) {
        kitchen.acceptOrder(order);
    }

    public void takeOrder(Order newOrder) {
        this.order = newOrder;
    }
}
